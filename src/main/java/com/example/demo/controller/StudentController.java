package com.example.demo.controller;

import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository db;

    //获取表的所有数据
    @GetMapping(value = "/db")
    public List<Student> studentList() {
        return  db.findAll();
    }

    //增加数据
    @PostMapping(value = "/db")
    public Student studentAdd(@RequestParam("age") Integer age, @RequestParam("height") Integer height) {
        Student stu = new Student();
        stu.setAge(age);
        stu.setHeight(height);
        return db.save(stu);
    }
    //通过ID查找
    @GetMapping(value = "/db/{id}")
    public Student studentFindById(@PathVariable("id") Integer searchId){
        return db.findOne(searchId);
    }

    //通过age查询
    @GetMapping(value = "/db/age/{age}")
    public Student studentFindByAge(@PathVariable("age") Integer searchAge){
        return db.findOne(searchAge);
    }

    //通过height查询
    @GetMapping(value = "/db/height/{height}")
    public Student studentFindByHeight(@PathVariable("height") Integer searchHeight){
        return db.findOne(searchHeight);
    }

    //更新原有的数据
    @PutMapping(value = "/db/{id}")
    public Student studentUpdate(@PathVariable("id") Integer id, @RequestParam("age") Integer age, @RequestParam("height") Integer height) {
        Student stu = new Student();
        stu.setId(id);
        stu.setAge(age);
        stu.setHeight(height);
        return  db.save(stu);
    }

    //删除
    @DeleteMapping(value = "db/{id}")
    public void  studentDelete(@PathVariable("id") Integer id) {
        db.delete(id);
    }
}
