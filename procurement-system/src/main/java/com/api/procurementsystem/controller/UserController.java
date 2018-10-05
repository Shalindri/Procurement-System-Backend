package com.api.procurementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.api.procurementsystem.entity.User;
import com.api.procurementsystem.service.user.UserService;


/**
 * The Class UserController.
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	/** The user service. */
	@Autowired
	UserService userService;
	
	/**
	 * Check login.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the string
	 */
	@ResponseBody
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	 public String checkLogin(@RequestBody String username ,@RequestBody String password) {

		 System.out.println(username + password);
	     return userService.checkLogin(username, password);
	 }
	
	/**
	 * Check login.
	 *
	 * @param user the user
	 */
	@ResponseBody
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public void checkLogin(@RequestBody User user) {
	     userService.registerUser(user);
	 }
	
	

}
