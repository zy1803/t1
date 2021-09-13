package com.example.demo.servlet;

import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListAllStudentServlet extends HttpServlet {

    @Autowired
    private  StudentController studentController;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = studentController.getAll();
        System.out.println(list);
        //放入请求域中
        req.getSession().setAttribute("students", list);
        //转发到页面
        req.getRequestDispatcher("/result/search.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
