package com.formDemoBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formDemoBackend.customException.BusinessException;
import com.formDemoBackend.model.User;
import com.formDemoBackend.repository.UserRepo;

@Service
public class UserService {

	 @Autowired
	    private UserRepo userRepo;

	    public User addUser(User user) {
	    	try {
	    		if(user.getName().isEmpty() || user.getName().length() ==0) {
	    			throw new BusinessException("601","Please send propper name");
	    		}
	    		User savedUser = userRepo.save(user);
	    		return savedUser;
	    	}catch (IllegalArgumentException e) {
				throw new BusinessException("602","Given user is null " +e.getMessage());
			}catch (Exception e) {
				throw new BusinessException("603","Something went wrong in service layer " +e.getMessage());
			}
	     }

		public List<User> getAllUser() {
			try {

				List<User> userList = userRepo.findAll();
				if(userList.isEmpty())
					throw new BusinessException("604","User List is empty");
				return userList;
			}catch (Exception e) {
				throw new BusinessException("605","Something went wrong fetch all user in service layer "+e.getMessage());
			}
		}

}
