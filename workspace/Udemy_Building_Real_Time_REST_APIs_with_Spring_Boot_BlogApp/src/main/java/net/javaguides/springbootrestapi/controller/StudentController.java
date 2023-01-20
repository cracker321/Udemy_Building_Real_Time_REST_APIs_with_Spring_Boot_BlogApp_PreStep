package net.javaguides.springbootrestapi.controller;


import net.javaguides.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){

        Student student = new Student(1, "Ramesh", "Fadatare"); //'Student 객체'를 1개만 생성

        return student;

    }

         //'Student 객체'를 '여러 개' 생성하여 List에 담음


    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();

        //- 아래에서 'List'에 들어갈 수 있는 것은 바로 '객체'이기 때문에, 'new Student(...)' 형식의 'Student 객체'를
        //넣어주는 것이다!!!
        //- 그리고, '생성자'를 통해서 '각 Student 객체'들의 '개별 속성'을 '정해주는 것'이다!
        students.add(new Student("1", "yujong", "cho"));
        students.add(new Student("2", ))


    }


}
