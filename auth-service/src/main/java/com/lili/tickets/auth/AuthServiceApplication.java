package com.lili.tickets.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.beans.factory.annotation.Value;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
@EnableJpaRepositories("com.lili.tickets.auth.repository")
@EntityScan("com.lili.tickets.auth.entity")
@ComponentScans({@ComponentScan("com.lili.tickets.auth.dev")})
public class AuthServiceApplication {

	public AuthServiceApplication(@Value("${spring.profiles.active:default}") String profile) {
        System.out.println("===> Active Spring profile: " + profile);
    }

	public static void main(String[] args) {
		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.configure()
			.directory("src/main/resources")
			.ignoreIfMalformed()
			.ignoreIfMissing()
			.load();

			// Inject environment variables into Spring properties
			dotenv.entries().forEach(entry -> {
				System.setProperty(entry.getKey(), entry.getValue());
			});

		SpringApplication.run(AuthServiceApplication.class, args);
	}

}
