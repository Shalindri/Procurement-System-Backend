package com.api.procurementsystem.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.procurementsystem.entity.User;
import com.api.procurementsystem.repository.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class UserService.
 */
@Service
public class UserService {
	
	/** The user repository. */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * Check login.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the string
	 */
	public String checkLogin(String username, String password) {
		
		List<User> users = (List<User>) userRepository.findAll();
		String role = null;
		for(User u:users) {
			//System.out.println(po.getOrder_status());
			String uname= u.getPassword();
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

	/**
	 * Register user.
	 *
	 * @param user the user
	 */
	public void registerUser(User user) {
		
		userRepository.save(user);
	}
	

}
