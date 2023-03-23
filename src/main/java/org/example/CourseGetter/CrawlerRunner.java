package org.example.CourseGetter;

import java.io.*;
import java.nio.charset.Charset;

class CrawlerRunner {

    public static void Run(String name, String pwd) {
        try {
            String[] command = {"pipenv", "run", "python", "crawler.py", "-u", name, "-p", pwd};
            ProcessBuilder builder = new ProcessBuilder(command);
            builder.directory(new File("shu-course-data-main\\"));
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
