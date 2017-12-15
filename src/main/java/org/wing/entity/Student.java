package org.wing.entity;

/**
 * Created by HarvestWu on 2017/12/15.
 */

/**
 * 学生认证信息类
 */
public class Student {
    private Integer id;
    private String studentNumber;
    private String password;
    private String idCard;

    public Student() {
    }

    public Student(String studentNumber, String password, String idCard) {
        this.studentNumber = studentNumber;
        this.password = password;
        this.idCard=idCard;
    }

    public Student(Integer id, String studentNumber, String password, String idCard) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.password = password;
        this.idCard = idCard;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
