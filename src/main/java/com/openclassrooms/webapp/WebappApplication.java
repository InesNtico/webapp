package com.openclassrooms.webapp;

import com.openclassrooms.webapp.model.Employee;
import com.openclassrooms.webapp.repository.EmployeeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Data
@SpringBootApplication
public class WebappApplication implements CommandLineRunner {

	@Autowired
	private CustomProperties properties;



	public static void main(String[] args) {

		SpringApplication.run(WebappApplication.class, args);



	}


	@Override
	public void run(String... args) throws Exception {


	}
}
