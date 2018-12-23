package com.example.spring.demo2;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: Student
 * @description:
 * @author:
 * @create: 2018-12-12 00:33
 **/

public class Student {
    private Integer id;
    private String name;
    private List<String> dream;
    private Map<String, Integer> score;
    private boolean graduation;

    public Student() {

    }

    public Student(Integer id, String name, List<String> dream,
                   Map<String, Integer> score, boolean graduation) {
        this.id = id;
        this.name = name;
        this.dream = dream;
        this.score = score;
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dream=" + dream
                + ", score=" + score + ", graduation=" + graduation + "]";
    }

}