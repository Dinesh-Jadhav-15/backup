package com.College.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.College.Entity.CollegeEntity;
import com.College.Repo.CollegeRepo;
import com.College.comman.StudentComman;
import com.College.comman.StudentRequest;
import com.College.comman.StudentResponse;

@Service
public class CollegeService {

	@Autowired
	private CollegeRepo collegeRepo;
	@Autowired
	private RestTemplate restTemplate;

	public CollegeEntity addCollege(CollegeEntity college) {
		return collegeRepo.save(college);
	}

	public List<CollegeEntity> getAllCollege() {
		return collegeRepo.findAll();
	}

	public StudentResponse saveOrder(StudentRequest request) {

		String response = "";
		String url = "http://http://localhost:9091/students/getAll/payment/doPayment";

		CollegeEntity order = request.getCollegeEntity();
		StudentComman payment = request.getStudentComman();
		payment.setRollNo(order.getId());
		payment.setName(order.getName());
		payment.setAge(order.getAge());
		payment.setGender(order.getGender());

		CollegeEntity paymentResponse = restTemplate.postForObject(url, payment, CollegeEntity.class);

		collegeRepo.save(order);

		return new StudentResponse(paymentResponse.getId(), paymentResponse.getName(), paymentResponse.getGender(),
				paymentResponse.getAge());
	}

}
