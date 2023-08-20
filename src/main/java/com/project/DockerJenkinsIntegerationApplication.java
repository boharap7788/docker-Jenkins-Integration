package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegerationApplication.class, args);
		
		System.out.println("DOCKER JENKINS INTEGERATION BUILD SUCCESSFULL >>>>>>> ");
		
	}

}
