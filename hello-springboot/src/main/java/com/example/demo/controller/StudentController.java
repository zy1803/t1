package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/search")
    public String getAll(Model model) {
        String sql = "SELECT * FROM student";
        List<Student> studentList = jdbcTemplate.query(sql, new RowMapper<Student>() {
            Student student = null;

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return student;
            }
        });
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        Model stu = model.addAttribute("students", studentList);
        return "search";
    }
}
