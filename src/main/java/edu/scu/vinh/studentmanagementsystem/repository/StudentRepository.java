package edu.scu.vinh.studentmanagementsystem.repository;

import edu.scu.vinh.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
