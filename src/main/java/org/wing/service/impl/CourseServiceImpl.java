package org.wing.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wing.dao.CourseGetDao;
import org.wing.entity.Course;
import org.wing.service.CourseService;

import java.util.List;

/**
 * Created by HarvestWu on 2019/3/27.
 */

/**
 * 课程查询服务层接口实现层
 */
@Service("classService")
public class CourseServiceImpl implements CourseService {
   @Autowired
   CourseGetDao courseGetDao;

    /**
     * 根据学号查询课程编号
     * @param studentNumber 学号
     * @return 返回课程编号
     */
    @Override
    public List<String> getCourseNumber(String studentNumber) {
        return courseGetDao.getCourseNumber(studentNumber);
    }

    /**
     * 根据课程编号和学期查询课程信息
     * @param courseNumber 课程编号
     * @return 课程信息
     */
    @Override
    public Course getCourse(String courseNumber) {
        return courseGetDao.getCourse(courseNumber);
    }

}
