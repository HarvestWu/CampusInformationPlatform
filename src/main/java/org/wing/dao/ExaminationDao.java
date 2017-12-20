package org.wing.dao;

/**
 * Created by yeleia on 17-12-20.
 */

import org.wing.entity.Examination;

import java.util.List;

/**
 * 学生查询考试安排
 */
public interface ExaminationDao {
    /**
     * 学生根据学号查询考试安排
     * @param studentNumber
     * @return
     */
    List<Examination> getExamByStudentNumber(String studentNumber);

    /**
     * 根据考试周次，星期，节数，教室查询该堂考试信息，并按学号排序
     * @param examination
     * @return
     */
    List<Examination> getExamByMap(Examination examination);

}
