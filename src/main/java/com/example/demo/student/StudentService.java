package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Ciprian",
                        "tomaciprian@gmail.com",
                        LocalDate.of(1992, 10, 10),
                        29
                )
        );
    }
}
