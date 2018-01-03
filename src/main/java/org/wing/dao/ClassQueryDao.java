package org.wing.dao;


import org.wing.entity.ClassQuery;

/**
 * Created by yeleia on 17-12-29.
 */
public interface ClassQueryDao {
    /**
     * 根据课程编号和学期查询课程信息
     * @param courseNumber
     * @return
     */
    ClassQuery getClassQuery(String courseNumber,String term);

}
