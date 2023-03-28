package org.example.CourseGetter;

import java.util.List;

public class Course {
    private String campus;
    private int capacity;
    private String classTime;
    private String courseId;
    private String courseName;
    private float credit;
    private List<String> limitations;
    private String number;
    private String position;
    private String teacherId;
    private String teacherName;
    private String teacherTitle;

    public Course() {}

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public void setLimitations(List<String> limitations) {
        this.limitations = limitations;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }

    public String getCampus() {
        return campus;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getClassTime() {
        return classTime;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public float getCredit() {
        return credit;
    }

    public List<String> getLimitations() {
        return limitations;
    }

    public String getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "campus='" + campus + '\'' +
                ", capacity=" + capacity +
                ", classTime='" + classTime + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", limitations=" + limitations +
                ", number='" + number + '\'' +
                ", position='" + position + '\'' +
                ", teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherTitle='" + teacherTitle + '\'' +
                '}';
    }
}
