package com.doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.Entity.DoctorEntity;
import com.doctor.Entity.DoctorResponse;
import com.doctor.service.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	@PostMapping("/addDoctor")
	public DoctorEntity addDoctor(@RequestBody DoctorEntity doctor) {
		return this.doctorService.addDoctor(doctor);
	}

	@GetMapping("/getDoctor/{name}")
	public DoctorResponse getDoctor(@PathVariable String name) {
		return this.doctorService.getDoctor(name);
	}

}