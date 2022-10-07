package com.College.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.College.Entity.CollegeEntity;
import com.College.service.CollegeService;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	
	@GetMapping("/college")
	public String Display() {
		return "College";
	}
	
	  @PostMapping("/addCollege")
	    public CollegeEntity addCollege(@RequestBody CollegeEntity college) {
	        return collegeService.addCollege(college);
	    }
	  
	    @GetMapping("/getAll")
	    public List<CollegeEntity> getAllCollege() {
	        return collegeService.getAllCollege();
	    }
	    
}
