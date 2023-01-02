package edu.scu.vinh.studentmanagementsystem.service.impl;

import edu.scu.vinh.studentmanagementsystem.entity.Student;
import edu.scu.vinh.studentmanagementsystem.repository.StudentRepository;
import edu.scu.vinh.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
