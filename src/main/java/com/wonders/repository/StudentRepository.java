package com.wonders.repository;

import com.wonders.entity.Student;

import java.util.List;

public interface StudentRepository {
    public List<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void update(Student student);
    public void deleteById(long id);
    public int count();
}
