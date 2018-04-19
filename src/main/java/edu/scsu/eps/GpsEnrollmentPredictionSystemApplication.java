package edu.scsu.eps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="edu.scsu.eps.repositories")
@SpringBootApplication
public class GpsEnrollmentPredictionSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpsEnrollmentPredictionSystemApplication.class, args);
	}
}
