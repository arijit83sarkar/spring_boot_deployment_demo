package com.raven.spring_boot_deployment_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeploymentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeploymentDemoApplication.class, args);
        System.out.println("SpringBootDeploymentDemo application started ...... ");
    }
}