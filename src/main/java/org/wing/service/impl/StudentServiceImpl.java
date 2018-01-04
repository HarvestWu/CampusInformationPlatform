package org.wing.service.impl;

/**
 * Created by HarvestWu on 2017/12/15.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wing.dao.*;
import org.wing.entity.ClassQuery;
import org.wing.entity.ComputerGradeTwo;
import org.wing.entity.Examination;
import org.wing.entity.Student;
import org.wing.service.StudentService;

import java.util.List;

/**
 * 学生服务层接口实现层
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private ExaminationDao examinationDao;
    @Autowired
    private ClassQueryDao classQueryDao;
    @Autowired
    private StudentSelectDao studentSelectDao;
    @Autowired
    private ComputerGradeTwoDao computerGradeTwoDao;
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

    /**
     * 学生根据学号查询考试安排
     * @param studentNumber
     * @return
     */
    public List<Examination> getExamByStudentNumber(String studentNumber) {
        return examinationDao.getExamByStudentNumber(studentNumber);
    }
    /**
     * 根据考试周次，星期，节数，教室查找，并按学好排序
     * @param examination
     * @return
     */
    @Override
    public List<Examination> getExamByMap(Examination examination) {
        return examinationDao.getExamByMap(examination);
    }

    /**
     * 根据学生学号查询课程编号
     * @param studentNumber
     * @return
     */
    @Override
    public List<String> getCourseNumber(String studentNumber) {
        return studentSelectDao.getCourseNumber(studentNumber);
    }

    /**
     * 根据课程编号和学期查询课程信息
     * @param courseNumber
     * @return
     */
    @Override
    public ClassQuery getClassQuery(String courseNumber,String term) {
        return classQueryDao.getClassQuery(courseNumber,term);
    }

    @Override
    public List<ComputerGradeTwo> getComputerGradeTwo(String studentNumber) {
        return computerGradeTwoDao.getComputerGradeTwo(studentNumber);
    }
}
