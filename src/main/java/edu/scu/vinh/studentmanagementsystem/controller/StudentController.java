package edu.scu.vinh.studentmanagementsystem.controller;

import edu.scu.vinh.studentmanagementsystem.entity.Student;
import edu.scu.vinh.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handle method to handle list students and return mode and view

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("student", studentService.getAllStudent());
        return "students";
    }
}
