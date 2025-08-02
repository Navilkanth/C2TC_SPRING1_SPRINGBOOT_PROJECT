package com.tnsif_courseservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif_courseservice.entity.CourseEntity;
import com.tnsif_courseservice.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public CourseEntity getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public CourseEntity saveCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public CourseEntity updateCourse(Long id, CourseEntity course) {
        CourseEntity existingCourse = courseRepository.findById(id).orElse(null);

        if (existingCourse != null) {
            existingCourse.setName(course.getName());
            existingCourse.setDescription(course.getDescription()); // FIXED
            existingCourse.setInstructor(course.getInstructor());
            existingCourse.setPrice(course.getPrice());
            return courseRepository.save(existingCourse);
        }

        return null;
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
