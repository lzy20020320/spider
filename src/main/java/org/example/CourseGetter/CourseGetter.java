package org.example.CourseGetter;

import java.util.List;

public class CourseGetter {
    public static List<SelectedCourse> UpdatePersonalCourses(String name, String pwd) {
        CrawlerRunner.PersonalCrawl(name,pwd);
        return JsonReader.GetPersonalCourses(name);
    }

    public static List<SelectedCourse> GetPersonalCourses(String name) {
        return JsonReader.GetPersonalCourses(name);
    }

    public static List<Course> GetAllCourses() {
        return JsonReader.GetAllCourses();
    }
    public static List<Course> UpdateAllCourses() {
        CrawlerRunner.AllCrawl();
        return JsonReader.GetAllCourses();
    }
}
