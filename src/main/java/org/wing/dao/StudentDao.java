package org.wing.dao;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.wing.entity.ComputerGradeTwo;
import org.wing.entity.Student;

/**
 * 学生信息dao层
 */
public interface StudentDao {

    /**
     * 根据学号查询学生身份证号码
     * @param studentNumber
     * @return
     */
    String getIdCardByStudentNumber(String studentNumber);

    /**
     * 通过学号获取学生认证信息
     * @param studentNumber
     * @return
     */
    Student getStudentByStudentNumber(String studentNumber);

    /**
     * 写入学生认证信息
     * @param student
     */
    void insertStudent(Student student);

    /**
     * 更新学生认证信息
     * @param student
     */
    void updateStudent(Student student);

}
