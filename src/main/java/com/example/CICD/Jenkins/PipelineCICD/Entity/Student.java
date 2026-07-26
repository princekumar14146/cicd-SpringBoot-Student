package com.example.CICD.Jenkins.PipelineCICD.Entity;

import com.example.CICD.Jenkins.PipelineCICD.CustomIdGenerator.StudentId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @StudentId
    private String studentId;

    private String studentName;

    private String studentEmail;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Course> studentCourse;
}
