package org.wing.controller;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wing.entity.ClassQuery;
import org.wing.entity.ComputerGradeTwo;
import org.wing.entity.Examination;
import org.wing.entity.Student;
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

    /**
     * 学生查询考试安排
     * @param studentNumber
     * @return
     */
    @RequestMapping(value = "/examSchedule")
    @ResponseBody
    public Map<String,Object> examSchedule(@RequestParam(value = "studentNumber",defaultValue = "false")String studentNumber){
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<Examination> examination=studentService.getExamByStudentNumber(studentNumber);
        if (examination!=null) {
            for (int i = 0; i < examination.size(); i++) {
                if (examination.get(i).getExamMethod().equals("上机考核")) {
                    List<Examination> examinations = studentService.getExamByMap(examination.get(i));
                    int temp = 0;
                    for (int j = 0; j < examinations.size(); j++) {
                        temp++;
                        //System.out.println(examinations.get(i).getClassroom());
                        if (studentNumber.equals(examinations.get(j).getStudentNumber())) {
                            examination.get(i).setSeatNumber(String.valueOf(temp));
                            System.out.println(temp);
                            break;
                        }
                    }
                }
            }
        }
       resultMap.put("examination",examination);
       return resultMap;
    }

    /**
     * 学生查询课表,根据学号和学期查询
     * @return
     */
    @RequestMapping(value = "/queryClass")
    @ResponseBody
    public Map<String,Object> queryClass(@RequestParam(value = "id")String studentNumber,@RequestParam(value = "term")String term){
        Map<String, Object> resultMap = new LinkedHashMap<>();
        List<ClassQuery>classQueries=new ArrayList<>();
        List<String> courseNumbers=studentService.getCourseNumber(studentNumber);
        for (int i=0;i<courseNumbers.size();i++){
            ClassQuery classQuery=studentService.getClassQuery(courseNumbers.get(i),term);
            if (classQuery!=null) {
                String a[][] = StringUtil.sub(classQuery.getClassTime(), classQuery.getClassroom());
                for (int j = 0; j < a.length; j++) {
                    ClassQuery query = null;
                    try {
                        query = classQuery.clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    assert query != null;
                    query.setClassTime(a[j][0]);
                    query.setClassroom(a[j][1]);
                   /*System.out.println(a[j][0]);*/
                    System.out.println(query);
                    classQueries.add(query);
                }
            }
        }
        resultMap.put("classQuery",classQueries);
        return resultMap;
    }

    /**
     * 根据学号查询计算机等级考试成绩
     * @return
     */
    @RequestMapping("/queryComputerGradeTwo")
    @ResponseBody
    public Map<String ,Object> queryComputerGradeTwo(@RequestParam(value = "studentNumber",defaultValue = "false")String studentNumber){
        Map<String, Object> resultMap =new LinkedHashMap<>();
        List<ComputerGradeTwo> computerGradeTwos=null;
        if (StringUtils.isNotBlank(studentNumber)){
            System.out.println("studentNumber："+studentNumber);
           computerGradeTwos= studentService.getComputerGradeTwo(studentNumber);
            if (computerGradeTwos!=null&&computerGradeTwos.size()>0){
                resultMap.put("msg","查询成功");
                resultMap.put("computerGradeTwo",computerGradeTwos);
                return resultMap;
            }
            else{
                resultMap.put("msg","您暂时没有成绩信息");
                return resultMap;
            }
        }else{
            System.out.println("学号为空！！！");
            resultMap.put("msg","学号不能为空");
             return resultMap;
        }

}

}
