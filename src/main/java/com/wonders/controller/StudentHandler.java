package com.wonders.controller;

import com.wonders.entity.Student;
import com.wonders.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.save(student);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.update(student);
    }

    @DeleteMapping("/deleteById")
    public void deleteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }









}
