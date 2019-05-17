package org.wing.entity;

/**
 * Created by HarvestWu on 2019/3/27.
 */
public class StudentSelect {
    private Integer id;
    private String studentNumber;//学生学号
    private String courseNumber;//课程编号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
