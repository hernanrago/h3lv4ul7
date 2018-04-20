package net.h3lv4ul7.mtgodyssey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.h3lv4ul7.mtgodyssey.model.User;
import net.h3lv4ul7.mtgodyssey.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public void deleteUser(User user) {
		userRepository.delete(user);

	}

}
