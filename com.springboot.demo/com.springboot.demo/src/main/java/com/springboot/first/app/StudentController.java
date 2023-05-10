package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http://localhost:8080/student

    @GetMapping("/student")
    public Student getStudent(){
       return new Student("Mrunmai","Hingane");
    }

    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student>students= new ArrayList<>();
        students.add(new Student("Prabodh","Naik"));
        students.add(new Student("Priyanka","Patil"));
        students.add(new Student("Ashwini","Kumbhar"));
        students.add(new Student("Mrunmai","Hingane"));

        return students;

    }
    //http://localhost:8080/student/Mrunmai/Hingane

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathvariable(@PathVariable("firstName")String firstName,
                                       @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    //build rest APi to handle query parameters
    //http://localhost:8080/student/query?firstName=Mrunmai&lastName=Hingane

    @GetMapping("/student/query")
    public Student studentQueryparam(@RequestParam(name="firstName")String fisrtName,
                                     @RequestParam(name="lastName") String lastName){
       return new Student(fisrtName,lastName);
    }


}
