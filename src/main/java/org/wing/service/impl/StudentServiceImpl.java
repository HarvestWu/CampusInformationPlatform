package org.wing.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wing.dao.StudentGetDao;
import org.wing.entity.Student;
import org.wing.service.StudentService;

/**
 * Created by HarvestWu on 2019/3/26.
 */
@Service("userService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentGetDao studentGetDao;
    //从sql数据库查询学生信息
    @Override
    public Student getStudentInfo(String studentNumber) {
        return studentGetDao.getStudent(studentNumber);
    }
}
