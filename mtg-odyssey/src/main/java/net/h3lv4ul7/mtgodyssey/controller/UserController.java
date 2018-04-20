package net.h3lv4ul7.mtgodyssey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import net.h3lv4ul7.mtgodyssey.model.User;
import net.h3lv4ul7.mtgodyssey.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/user-form")
	public ModelAndView showUserForm() {
		return new ModelAndView("user-form", "user", new User());
	}
	
	@PostMapping("/user-save")
	public String saveUser(User user) {
		userService.saveUser(user);
		return "redirect:/user-list";
	}
	
	@GetMapping("/user-list")
	public ModelAndView showUserList() {
		return new ModelAndView("user-list",
				"users", userService.findAllUsers());
	}
	
	

}
