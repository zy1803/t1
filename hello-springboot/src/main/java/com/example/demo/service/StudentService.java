package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询全部学生
     * @return
     */
    List<Student> getAllStudent();

    /**
     * 根据id查询学生
     * @return
     */
    Student getStudentById(Integer id);
}
