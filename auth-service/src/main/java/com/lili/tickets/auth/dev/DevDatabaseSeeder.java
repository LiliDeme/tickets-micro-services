package com.lili.tickets.auth.dev;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Profile;
import com.lili.tickets.auth.entity.User;
import com.lili.tickets.auth.repository.UserRepository;

@Component
@Profile("dev") // This ensures that this seeder runs only in the 'dev' profile
public class DevDatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;

    public DevDatabaseSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
	public void run(String... args) throws Exception {
		// Initialize the database with a default user
		
			User user = new User();
			user.setUsername("test_user");
			userRepository.save(user);
			System.out.println("User saved with id: " + user.getId());
		
	}
    
}
