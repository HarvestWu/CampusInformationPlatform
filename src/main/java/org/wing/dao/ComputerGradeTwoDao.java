package org.wing.dao;

import org.wing.entity.ComputerGradeTwo;

import java.util.List;

/**
 * Create by ~JH~ on 2018/1/4
 */
public interface ComputerGradeTwoDao {
    public List<ComputerGradeTwo> getComputerGradeTwo(String studentNumber) ;
}
