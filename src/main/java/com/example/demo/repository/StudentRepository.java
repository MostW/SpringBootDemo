package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //通过其他方式来查询
    public List<Student> findByAge(Integer age);
    public  List<Student> findByHeight(Integer height);
}
