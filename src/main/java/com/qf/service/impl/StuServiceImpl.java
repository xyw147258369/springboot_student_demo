package com.qf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @DATE 2019/9/25
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Student> implements IStuService {

    @Autowired
    private StuMapper stuMapper;
}
