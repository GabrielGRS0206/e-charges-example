package br.com.io.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class AppRegistration {

	public static void main(String[] args) {
		SpringApplication.run(AppRegistration.class, args);
	}

}
