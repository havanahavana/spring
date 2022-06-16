package tn.esprit.ExamenSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class ExamenSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSpringApplication.class, args);
	}

}
