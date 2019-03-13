package com.example.springboot303;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Course course = new Course("Astrophysics", "Neil D Tyson",
                "Just a course on stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley",
                "Rate of change of the rate of change", 3);
        repository.save(course);

        course = new Course("Astrophysics", "Neil D Tyson",
                "Learn your language children", 3);
        repository.save(course);
    }
}
