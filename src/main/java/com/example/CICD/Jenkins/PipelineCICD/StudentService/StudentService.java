package com.example.CICD.Jenkins.PipelineCICD.StudentService;

import com.example.CICD.Jenkins.PipelineCICD.Entity.Student;

import java.util.List;

public interface StudentService {

    public Student createStudents(Student student);

    public List<Student> getStudents();
}
