package com.example.CICD.Jenkins.PipelineCICD.StudentController;

import com.example.CICD.Jenkins.PipelineCICD.Entity.Student;
import com.example.CICD.Jenkins.PipelineCICD.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<Student> createStudentRecord(@RequestBody Student student) {
        Student students = studentService.createStudents(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(students);
    }

    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>> getStudentRecords() {
        List<Student> students = studentService.getStudents();
        return ResponseEntity.status(HttpStatus.OK).body(students);
    }
}
