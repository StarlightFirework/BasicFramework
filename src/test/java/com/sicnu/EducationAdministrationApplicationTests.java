package com.sicnu;

import com.sicnu.pojo.Student;
import com.sicnu.repository.StudentRepository;
import com.sicnu.utils.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class EducationAdministrationApplicationTests {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    JwtUtil jwtUtil;
    @Test
    void contextLoads() {
//        Student s = new Student(null,"刘镇涛",2023110131);
//        studentRepository.save(s);
    }
    @Test
    void testjwt(){
        String jwt = "eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi5YiY6ZWH5rabIiwiZXhwIjoxNzM0OTQ1NTU5LCJhZ2UiOjEyfQ.HnCEks7oaRez-11lFUSUyRY2hRk_Uvk8y-SOuqJCoPY";

        String re = jwtUtil.extractClaimContent(jwt,"name");
        System.out.println(re);
    }
}
