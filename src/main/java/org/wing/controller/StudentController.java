package org.wing.controller;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.wing.entity.Course;
import org.wing.entity.Student;
import org.wing.service.CourseService;
import org.wing.service.StudentService;
import org.wing.utils.CryptographyUtil;
import org.wing.utils.StringUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 学生控制层
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    CourseService courseService;

    /**
     * 获取学生信息
     * @param studentNumber 学号
     * @return 学生信息
     */
    @RequestMapping(value = "/getStudentInfo",method = RequestMethod.GET)
    @ResponseBody
    public Student getStudentInfo(@Param("studentNumber")String studentNumber) {
        System.out.println("controller");
        return studentService.getStudentInfo(studentNumber);
    }

    /**
     * 获取课程编号
     * @param studentNumber 学号
     * @return 课程编号序列
     */
    @RequestMapping(value = "/getCourseNumber")
    @ResponseBody
    public List<String> getCourseNumber(@Param("studentNumber") String studentNumber){
        List<String> courseNumbers=courseService.getCourseNumber(studentNumber);
        return courseNumbers;
    }

    /**
     * 获取课程信息
     * @param courseNumber 课程编号
     * @return 课程信息
     */
    @RequestMapping(value = "/getCourseInfo")
    @ResponseBody
    public Course getCourseInfo(@Param("courseNumber") String courseNumber){
        Course course=courseService.getCourse(courseNumber);
        return course;
    }
}
