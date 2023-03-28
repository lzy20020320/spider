package org.example.CourseGetter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


class JsonReader {

    public static List<SelectedCourse> GetPersonalCourses(String name) {
        JSONParser parser = new JSONParser();
        List<SelectedCourse> cours = new ArrayList<SelectedCourse>();
        try {
            Object obj = parser.parse(new FileReader("shu-course-data-main\\interval-crawler-task-result\\terms\\"+name+".json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray coursesArray = (JSONArray) jsonObject.get("cours");
            for (Object courseObj : coursesArray) {
                JSONObject courseJson = (JSONObject) courseObj;
                SelectedCourse selectedCourse = new SelectedCourse();
                selectedCourse.setCourseKind((String) courseJson.get("category"));
                selectedCourse.setCourseId((String) courseJson.get("course_number"));
                selectedCourse.setCourseName((String) courseJson.get("course_name"));
                selectedCourse.setCredits((String) courseJson.get("credit"));
                selectedCourse.setSelect((Boolean) courseJson.get("select"));
                selectedCourse.setSemester((String) courseJson.get("semester"));
                cours.add(selectedCourse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (SelectedCourse selectedCourse : cours) System.out.println(selectedCourse.toString());
        return cours;
    }

    public static List<Course> GetAllCourses() {
        JSONParser parser = new JSONParser();
        List<Course> cours = new ArrayList<Course>();
        try {
            Object obj = parser.parse(new FileReader("shu-course-data-main\\interval-crawler-task-result\\terms\\"+"21001"+".json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray coursesArray = (JSONArray) jsonObject.get("cours");

            for (Object courseObj : coursesArray) {
                // Create a new Course object
                Course course = new Course();
                JSONObject courseJson = (JSONObject) courseObj;
                // Set the properties of the Course object using data from the JSON object
                course.setCampus((String)courseJson.get("campus"));
                course.setCapacity(Integer.parseInt((String) courseJson.get("capacity")));
                course.setClassTime((String)courseJson.get("classTime"));
                course.setCourseId((String)courseJson.get("courseId"));
                course.setCourseName((String)courseJson.get("courseName"));
                course.setCredit(Float.parseFloat((String)courseJson.get("credit")));

//                JSONArray limitationsArr = (JSONArray) jsonObject.get("limitations");
//                List<String> limitationsList = new ArrayList<String>();
//                for (int j = 0; j < limitationsArr.size(); j++) {
//                    limitationsList.add((String)limitationsArr.get(j));
//                }
//                course.setLimitations(limitationsList);

                course.setNumber((String)courseJson.get("number"));
                course.setPosition((String)courseJson.get("position"));
                course.setTeacherId((String)courseJson.get("teacherId"));
                course.setTeacherName((String)courseJson.get("teacherName"));
                course.setTeacherTitle((String)courseJson.get("teacherTitle"));
                cours.add(course);
                // Do something with the Course object
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Course course : cours) System.out.println(course.toString());
        return cours;
    }

}
