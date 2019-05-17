package org.wing.dao;

import org.wing.entity.Course;

import java.util.List;

/**
 * Created by HarvestWu on 2019/3/27.
 */
public interface CourseGetDao {

    /**
     * 根据学号查询课程编号
     *
     * @param studentNumber 学号
     * @return 课程编号
     */
    List<String> getCourseNumber(String studentNumber);

    /**
     * 根据课程编号和学期查询课程信息
     *
     * @param courseNumber 课程编号
     * @return 返回课程信息
     */
    Course getCourse(String courseNumber);
}