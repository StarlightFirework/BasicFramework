package com.sicnu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class EducationAdministrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationAdministrationApplication.class, args);
    }

}
