package com.example.demo;

import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Demo01 {
    @Autowired
    private StudentController studentController;

    @Test
    public void T1(){

        List<Student> list = studentController.getAll();
        System.out.println(list);
    }
}
