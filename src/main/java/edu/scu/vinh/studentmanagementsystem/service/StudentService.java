package edu.scu.vinh.studentmanagementsystem.service;

import edu.scu.vinh.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);
}
