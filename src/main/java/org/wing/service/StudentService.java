package org.wing.service;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.wing.entity.Student;

/**
 * 学生服务层接口
 */
public interface StudentService {

    /**
     * 根据学号和身份证号验证学生是否存在
     * @param studentNumber
     * @param idCard
     * @return
     */
    int judgeExistStudent(String studentNumber,String idCard);

    /**
     * 根据学号查询学生认证信息
     * @param studentNumber
     * @return
     */
    Student getStudentByStudentNumber(String studentNumber);

    /**
     * 注册学生认证信息
     * @param student
     */
    void insertStudent(Student student);

    /**
     * 更新学生认证信息
     * @param student
     */
    void updateStudent(Student student);
}
