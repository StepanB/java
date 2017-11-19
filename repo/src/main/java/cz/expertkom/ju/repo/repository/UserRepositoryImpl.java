package cz.expertkom.ju.repo.repository;

import org.springframework.stereotype.Repository;

import cz.expertkom.ju.interfaces.UserRepository;
import cz.expertkom.ju.interfaces.entity.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

	public User getUser(String username) {
		User user = new User();
		user.setFirstname("Karel");
		user.setLastname("Novak");
		user.setUsername(username);

		return user;
	}

}
