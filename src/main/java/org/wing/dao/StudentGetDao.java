package org.wing.dao;

import org.wing.entity.Student;

/**
 * Created by HarvestWu on 2019/3/26.
 */
public interface StudentGetDao {
    Student getStudent(String studentNumber);
}
