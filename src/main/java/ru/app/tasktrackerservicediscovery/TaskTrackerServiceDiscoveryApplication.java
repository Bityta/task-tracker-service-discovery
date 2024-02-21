package ru.app.tasktrackerservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TaskTrackerServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerServiceDiscoveryApplication.class, args);
    }
    //geteway mb

}
