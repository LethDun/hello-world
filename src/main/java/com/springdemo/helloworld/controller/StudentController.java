package com.springdemo.helloworld.controller;

import com.springdemo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("student")
public class StudentController {

    @GetMapping("create")
    public String creatStudent(){
        return "createStudent";
    }

    @PostMapping("create")
    public String createPost(HttpServletRequest request, HttpServletResponse response, Model model){
        String studentID = request.getParameter("studentID");
        String name = request.getParameter("name");

        Student student = new Student(studentID, name);
        return "detailStudent";
    }

}
