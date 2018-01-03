package org.wing.entity;

/**
 * Created by yeleia on 17-12-29.
 */
public class ClassQuery implements Cloneable{
    private Integer id;
    private String courseNumber;//课程编号
    private String campus;//校区
    private String teacher;//教师
    private String course;//课程
    private String classTime;//上课时间
    private String weeks;//周次
    private String classroom;//教室
    private String term;//学期

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public ClassQuery clone() throws CloneNotSupportedException {
        return (ClassQuery) super.clone();
    }

    @Override
    public String toString() {
        return "ClassQuery{" +
                "id=" + id +
                ", courseNumber='" + courseNumber + '\'' +
                ", campus='" + campus + '\'' +
                ", teacher='" + teacher + '\'' +
                ", course='" + course + '\'' +
                ", classTime='" + classTime + '\'' +
                ", weeks='" + weeks + '\'' +
                ", classroom='" + classroom + '\'' +
                ", term='" + term + '\'' +
                '}';
    }
}
