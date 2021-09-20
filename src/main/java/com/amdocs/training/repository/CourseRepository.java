package com.amdocs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.training.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
