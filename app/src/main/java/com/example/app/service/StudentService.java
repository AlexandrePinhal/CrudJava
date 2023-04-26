package com.example.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.app.model.Student;

@Service
public interface StudentService {
    List<Student> findAll();

    Student findById(Long id);

    List<Student> findByPromotion(String promotion);

    Student save(Student student);

    Student update(Student student);

    void deleteById(Long id);

}