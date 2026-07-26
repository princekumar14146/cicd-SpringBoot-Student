package com.example.CICD.Jenkins.PipelineCICD.StudentServiceImpl;

import com.example.CICD.Jenkins.PipelineCICD.Entity.Student;
import com.example.CICD.Jenkins.PipelineCICD.StudentRepository.StudentRepository;
import com.example.CICD.Jenkins.PipelineCICD.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student createStudents(Student student) {
        student.getStudentCourse().stream().forEach(course -> {course.setStudent(student);});
        Student studentSavedData = studentRepository.save(student);
        return studentSavedData;
    }

    @Override
    public List<Student> getStudents() {
     List<Student> allStudents =  studentRepository.findAll();
     return allStudents;
    }
}
