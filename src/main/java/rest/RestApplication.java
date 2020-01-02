package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		System.out.println("WORKING");
	}

}
