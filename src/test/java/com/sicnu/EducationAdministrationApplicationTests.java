package com.sicnu;

import com.sicnu.pojo.Student;
import com.sicnu.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EducationAdministrationApplicationTests {
    @Autowired
    StudentRepository studentRepository;
    @Test
    void contextLoads() {
//        Student s = new Student(null,"刘镇涛",2023110131);
//        studentRepository.save(s);
    }

}
