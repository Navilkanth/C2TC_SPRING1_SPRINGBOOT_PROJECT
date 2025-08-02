package com.tnsif_courseservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif_courseservice.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
