package com.example.CICD.Jenkins.PipelineCICD.StudentRepository;

import com.example.CICD.Jenkins.PipelineCICD.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
