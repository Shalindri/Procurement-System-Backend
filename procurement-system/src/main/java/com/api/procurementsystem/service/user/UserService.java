package com.api.procurementsystem.service.user;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.procurementsystem.entity.PurchaseOrder;
import com.api.procurementsystem.entity.User;
import com.api.procurementsystem.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public String checkLogin(String username, String password) {
		
		List<User> users = (List<User>) userRepository.findAll();
		String role = null;
		for(User u:users) {
			//System.out.println(po.getOrder_status());
			String uname= u.getUsername();
			String pword=u.getPassword();
			
			if(uname.equals(username)){
				if(pword.equals(password)){
					role= u.getRole();
				}
			}
		}
		System.out.println("role ="+role);
		return role;
		
	}

	public void registerUser(User user) {
		
		userRepository.save(user);
	}
	

}
