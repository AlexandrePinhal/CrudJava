package com.example.app.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.app.model.Student;
import com.example.app.service.StudentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Student> findAll() {
       List<Student> students = new ArrayList<>();
       try {
           students = studentService.findAll();
       } catch (Exception e) {
           System.out.println("Erreur " + e.getMessage());
       }
       return students;
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student findById(@PathVariable Long id){
        Student student = new Student();
       try {
           student = studentService.findById(id);
       } catch(Exception e) {
           System.out.println("Erreur " + e.getMessage());
       }
       return student;
    }

    @RequestMapping(value = "/students/{promotion}", method = RequestMethod.GET)
    public List<Student> findByPromotion(@PathVariable String promotion){
        List<Student> students = new ArrayList<>();
        try {
            students = studentService.findByPromotion(promotion);
        } catch(Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return students;
    }

    @RequestMapping(value = "/student/save", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=Application/json")
    public Student save(@RequestBody Student student) {
        try {
            student = studentService.save(student);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return student;
    }

    @RequestMapping(value = "/student/update", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=Application/json")
    public Student update(@RequestBody Student student) {
        try {
            student = studentService.update(student);
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
        return student;
    }


    @RequestMapping(value = "/student/delete/{id}", method = { RequestMethod.GET, RequestMethod.DELETE }, headers = "Accept=Application/json")
    public void deleteById(@PathVariable Long id) {
        Student student = this.studentService.findById(id);
        if (student != null && !student.delegate) {
            this.studentService.deleteById(id);
        } else {
            System.out.println("L'étudiant ne peut pas être supprimé car il est délégué.");
        }
    }
}
