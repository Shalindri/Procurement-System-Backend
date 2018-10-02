package com.api.procurementsystem.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.procurementsystem.entity.Catalogue;
import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.User;
import com.api.procurementsystem.service.user.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	 @RequestMapping(value = "/login/", method = RequestMethod.GET)
	 public String checkLogin(@RequestBody String username ,@RequestBody String password) {
	     return userService.checkLogin(username, password);
	 }
	
	@ResponseBody
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public void checkLogin(@RequestBody User user) {
	     userService.registerUser(user);
	 }
	
	

}
