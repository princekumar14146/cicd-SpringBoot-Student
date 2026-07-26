package com.example.CICD.Jenkins.PipelineCICD.Entity;

import com.example.CICD.Jenkins.PipelineCICD.CustomIdGenerator.CourseId;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @CourseId
    private String courseId;
    private String courseName;
    private String courseDescription;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Student student;
}
