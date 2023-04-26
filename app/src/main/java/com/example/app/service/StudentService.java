package com.example.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.app.model.Student;

@Service
public interface StudentService {

    /*Fonction retournant toutes les occurrences de l'entité*/
    List<Student> findAll();

    /*Fonction retournant les occurrences de l'entité en envoyant son id*/
    Student findById(Long id);

    /*Fonction d'ajout d'une occurence*/
    Student save(Student student);

    /*Fonction de modification d'une occurence*/
    Student update(Student student);

    /*Fonction de suppression d'une occurence par id*/
    void deleteById(Long id);

}