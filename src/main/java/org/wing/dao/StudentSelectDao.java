package org.wing.dao;

import java.util.List;

/**
 * Created by yeleia on 17-12-30.
 */
public interface StudentSelectDao {
    /**
     * 根据学号查询课程编号
     * @param studentNumber
     * @return
     */
    List<String> getCourseNumber(String studentNumber);
}
