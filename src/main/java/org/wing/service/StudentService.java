package org.wing.service;

import org.apache.ibatis.annotations.Param;
import org.wing.entity.Student;

/**
 * Created by HarvestWu on 2019/3/26.
 */

/**
 * 用户服务接口
 */
public interface StudentService {
    public  Student getStudentInfo(@Param("studentNumber")String studentNumber);

}
