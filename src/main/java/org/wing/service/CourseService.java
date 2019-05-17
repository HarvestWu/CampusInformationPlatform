package org.wing.service;

/**
 * Created by HarvestWu on 2019/3/27.
 */

import org.wing.entity.Course;
import java.util.List;

/**
 * 课程服务层接口
 */
public interface CourseService {
    /**
     * 根据学号查询课程编号
     * @param studentNumber 学号
     * @return 返回课程编号
     */
    List<String> getCourseNumber(String studentNumber);

    /**
     * 根据课程编号和学期查询课程信息
     * @param courseNumber 课程编号
     * @return 课程信息
     */
    Course getCourse(String courseNumber);
}
