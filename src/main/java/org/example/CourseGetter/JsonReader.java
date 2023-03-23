package org.example.CourseGetter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


class JsonReader {

    public static List<Course> GetCourses(String name) {
        JSONParser parser = new JSONParser();
        List<Course> courses = new ArrayList<Course>();
        try {
            Object obj = parser.parse(new FileReader("shu-course-data-main\\interval-crawler-task-result\\terms\\"+name+".json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray coursesArray = (JSONArray) jsonObject.get("courses");


            for (Object courseObj : coursesArray) {
                JSONObject courseJson = (JSONObject) courseObj;
                Course course = new Course();
                course.setCourseKind((String) courseJson.get("category"));
                course.setCourseId((String) courseJson.get("course_number"));
                course.setCourseName((String) courseJson.get("course_name"));
                course.setCredits((String) courseJson.get("credit"));
                course.setSelect((Boolean) courseJson.get("select"));
                course.setSemester((String) courseJson.get("semester"));
                courses.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(courses.get(1).getCourseId());
        return courses;
    }

}
