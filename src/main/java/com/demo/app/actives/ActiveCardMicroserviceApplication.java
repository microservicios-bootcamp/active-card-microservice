package com.demo.app.actives;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableReactiveMongoAuditing
@EnableReactiveMongoRepositories
@EnableScheduling
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "APIs", version = "1.0", description = "Documentation APIs v1.0"))
public class ActiveCardMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveCardMicroserviceApplication.class, args);
		System.out.println("test git action v02 push from project");
	}

}
