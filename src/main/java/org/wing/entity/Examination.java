package org.wing.entity;

/**
 * Created by yeleia on 17-12-20.
 */

/***
 * 学生考试查询类
 */
public class Examination {
    private Integer id;
    private String studentNumber;//学生学号
    private String examCourse;//课程
    private String examMethod;//考核方式
    private String examWeek;//考试周次
    private String examWeekDay;//考试星期
    private String examOrder;//考试节次
    private String classroom;//考试教室
    private String seatNumber;//考试座位号

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

    public String getExamCourse() {
        return examCourse;
    }

    public void setExamCourse(String examCourse) {
        this.examCourse = examCourse;
    }

    public String getExamMethod() {
        return examMethod;
    }

    public void setExamMethod(String examMethod) {
        this.examMethod = examMethod;
    }

    public String getExamWeek() {
        return examWeek;
    }

    public void setExamWeek(String examWeek) {
        this.examWeek = examWeek;
    }

    public String getExamWeekDay() {
        return examWeekDay;
    }

    public void setExamWeekDay(String examWeekDay) {
        this.examWeekDay = examWeekDay;
    }

    public String getExamOrder() {
        return examOrder;
    }

    public void setExamOrder(String examOrder) {
        this.examOrder = examOrder;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Examination(Integer id, String studentNumber, String examCourse, String examMethod, String examWeek, String examWeekDay, String examOrder, String classroom, String seatNumber) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.examCourse = examCourse;
        this.examMethod = examMethod;
        this.examWeek = examWeek;
        this.examWeekDay = examWeekDay;
        this.examOrder = examOrder;
        this.classroom = classroom;
        this.seatNumber = seatNumber;
    }

    public Examination() {
    }
}
