package com.atguigu.myzhxy.service;

import com.atguigu.myzhxy.pojo.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.myzhxy.pojo.LoginForm;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface TeacherService extends IService<Teacher> {
    Teacher login(LoginForm loginForm);


    Teacher getByTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> paraParam, Teacher teacher);
}
