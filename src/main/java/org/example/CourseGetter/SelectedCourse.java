package org.example.CourseGetter;

class SelectedCourse {
    private String courseKind;
    private String courseId;
    private String courseName;
    private String credits;
    private boolean select;
    private String semester;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseKind() {
        return courseKind;
    }

    public void setCourseKind(String courseKind) {
        this.courseKind = courseKind;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseKind='" + courseKind + '\'' +
                ", courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits='" + credits + '\'' +
                ", select=" + select +
                ", semester='" + semester + '\'' +
                '}';
    }
}
