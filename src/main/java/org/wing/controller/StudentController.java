package org.wing.controller;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wing.entity.Student;
import org.wing.service.StudentService;
import org.wing.utils.CryptographyUtil;

/**
 * 学生控制层
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    /**
     * 验证是否存在该学生
     */
    @RequestMapping(value = "/judge")
    @ResponseBody
    public Integer judgeExistStudent(String studentNumber, String idCard){
        int result=studentService.judgeExistStudent(studentNumber,idCard);
        System.out.println(result);
        return result;
    }

    /**
     * 学生登录认证
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(Student student){
        student.setStudentNumber("20158531");
        student.setPassword("1234567");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(student.getStudentNumber(),
                CryptographyUtil.md5(student.getPassword()));
        try {
            subject.login(token);
            return "认证成功";
        }catch (Exception e){
            return "认证失败";
        }
    }

    /**
     * 学生注册认证信息
     * @return
     */
    @RequestMapping(value = "/register")
    @ResponseBody
    public String register(Student student){
        student.setStudentNumber("20158531");
        student.setPassword(CryptographyUtil.md5("1234567"));
        student.setIdCard("500231000000000000");
        studentService.insertStudent(student);
        return "成功";
    }


}
