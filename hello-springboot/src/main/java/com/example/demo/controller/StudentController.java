package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.Result;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("search")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询所有记录
     *
     * @return
     */
    @GetMapping("/getAllStudent")
    public String getAllStudent(Model model) {
        List<Student> list = studentService.getAllStudent();
        for (Student student : list) {
            log.info(student.toString());
        }
        model.addAttribute("AllStudent",list);
        return "getAllStudent";
    }

    /**
     * 根据id获取数据
     *
     * @param
     * @return
     */
    @GetMapping("/getStudentById")
    public Result getStudentById(@RequestBody Student student) {
        log.info("收到了请求：" + student.getId());
        Student studentSelect = studentService.getStudentById(student.getId());
        log.info("查到了对象：" + studentService);
        return Result.ok(studentService);
    }

}
