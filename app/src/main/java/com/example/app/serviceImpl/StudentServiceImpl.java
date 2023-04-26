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

    /*Fonction retournant toutes les occurrences de l'entité*/
    @Override
    public List<Student> findAll() {
       return studentRepository.findAll();
    }

    @Override
    /*Fonction retournant les occurrences de l'entité en envoyant son id*/
    public Student findById(Long id) {
       return studentRepository.findById(id).orElse(null);
    }

    /*Fonction d'ajout d'une occurence*/
    @Override
    public Student save(Student student) {
       return studentRepository.save(student);
    }

    /*Fonction de modification d'une occurence*/
    @Override
    public Student update(Student student) {
       return studentRepository.save(student);
    }

    /*Fonction de suppression d'une occurence par id*/
    @Override
    public void deleteById(Long id) {
    studentRepository.deleteById(id);
    }

}