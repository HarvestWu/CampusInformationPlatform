package org.wing.service.impl;

/**
 * Created by HarvestWu on 2017/12/15.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wing.dao.StudentDao;
import org.wing.entity.Student;
import org.wing.service.StudentService;

/**
 * 学生服务层接口实现层
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    /**
     * 根据学号和身份证号验证学生是否存在
     * @param studentNumber
     * @param idCard
     * @return
     */
    public int judgeExistStudent(String studentNumber, String idCard) {
        if (idCard.equals(studentDao.getIdCardByStudentNumber(studentNumber))){
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 根据学号查询学生认证信息
     * @param studentNumber
     * @return
     */
    public Student getStudentByStudentNumber(String studentNumber) {
        return studentDao.getStudentByStudentNumber(studentNumber);
    }

    /**
     * 注册学生认证信息
     * @param student
     */
    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }

    /**
     * 更新学生认证信息
     * @param student
     */
    public void updateStudent(Student student) {

    }
}
