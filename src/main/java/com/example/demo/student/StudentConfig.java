package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student ciprian = new Student(
                    "Ciprian",
                    "tomaciprian@gmail.com",
                    LocalDate.of(2000, 10, 10)
            );

            Student ana = new Student(
                    "Ana",
                    "bugheanuana@gmail.com",
                    LocalDate.of(2004, 10, 10)
            );

            Student olivia = new Student(
                    "Olivia",
                    "tomaOlivia@gmail.com",
                    LocalDate.of(2002, 10, 10)
            );
            repository.saveAll(List.of(ciprian, ana, olivia));
        };

    }

}
