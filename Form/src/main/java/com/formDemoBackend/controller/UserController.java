package com.formDemoBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formDemoBackend.customException.BusinessException;
import com.formDemoBackend.customException.ControllerException;
import com.formDemoBackend.model.User;
import com.formDemoBackend.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Add new employee
    @PostMapping("/addUser")
    public ResponseEntity<?> addUser(@RequestBody User employee) {
    	try {
    	User userSaved = userService.addUser(employee);
        return new ResponseEntity<User>(userSaved,HttpStatus.CREATED);
    	}catch (BusinessException e) {
    		 ControllerException ce= new ControllerException(e.getErrCode(),e.getErrMessage()); 
    		 return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}catch (Exception e) {
			 ControllerException ce= new ControllerException("611","Something went wrong in controller"); 
    		 return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
    }

    // Get all employee
    @GetMapping("/getAll")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
