package cz.expertkom.ju.interfaces;

import cz.expertkom.ju.interfaces.entity.User;

public interface UserRepository {

	User getUser(String username);
}