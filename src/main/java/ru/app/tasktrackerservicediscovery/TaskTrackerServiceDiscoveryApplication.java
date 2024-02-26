package ru.app.tasktrackerservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class to start the Task Tracker Service Discovery application.
 */
@SpringBootApplication
@EnableEurekaServer
public class TaskTrackerServiceDiscoveryApplication {

    /**
     * Main method to start the Task Tracker Service Discovery application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerServiceDiscoveryApplication.class, args);
    }
}
