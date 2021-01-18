package com.example.simpleMybatisPlus;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "student")
public class Student {
    @TableId(type = IdType.AUTO)
    public int id;

    public String name;

    public int age;

    public int teacherId;

    public Student(int id, String name, int age, int teacherId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", teacherId=" + teacherId +
                '}';
    }
}
