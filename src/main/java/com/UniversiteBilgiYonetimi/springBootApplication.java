package com.UniversiteBilgiYonetimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//@ComponentScan(basePackages = {"com.UniversiteBilgiYonetimi.Controller",
//        "com.UniversiteBilgiYonetimi.Service"
//        })
//@EntityScan("com.UniversiteBilgiYonetimi.Model")
//@EnableJpaRepositories("com.UniversiteBilgiYonetimi.Repository")

public class springBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(springBootApplication.class, args);
    }

}
