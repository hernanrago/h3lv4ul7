package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import net.h3lv4ul7.mtgodyssey.model.User;

public interface UserService {
	
	User saveUser(User user);
	
	User updateUser(User user);
		
	User findUserById(Integer id);
	
	List<User> findAllUsers();
	
	void deleteUser(User user);

}
