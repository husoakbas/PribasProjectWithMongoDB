package com.akbas.springboot.PribasProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories("com.akbas.springboot.PribasProject.TimelineRepository")
@ComponentScan("com.akbas.springboot.PribasProject.*")
public class PribasProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(PribasProjectApplication.class, args);

	}

}
