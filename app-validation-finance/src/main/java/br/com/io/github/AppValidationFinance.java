package br.com.io.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AppValidationFinance {

	public static void main(String[] args) {
		SpringApplication.run(AppValidationFinance.class, args);
	}

}
