package com.example.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.app.model.Student;
import com.example.app.repository.StudentRepository;
import com.example.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
       return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
       return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findByPromotion(String promotion) {
        return studentRepository.findByPromotion(promotion);
    }

    @Override
    public Student save(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
    studentRepository.deleteById(id);
    }

}