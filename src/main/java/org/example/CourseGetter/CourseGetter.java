package org.example.CourseGetter;

import java.util.List;

public class CourseGetter {
    public static List<Course> GetCourses(String name, String pwd) {
        CrawlerRunner.Run(name,pwd);
        return JsonReader.GetCourses(name);
    }

    public static List<Course> GetCourses(String name) {
        return JsonReader.GetCourses(name);
    }
}
