package com.example.course.repository;

import com.example.course.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface CourseRepository extends JpaRepository<Course, Long> {
        List<Course> findByName(String name);
    }

