package com.doctor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.Entity.DoctorEntity;
import com.doctor.Entity.DoctorResponse;
import com.doctor.Repo.DoctorRepo;

@Service
public class ServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public DoctorEntity addDoctor(DoctorEntity doctorEntity) {
		return doctorRepo.save(doctorEntity);
	}

	@Override
	public DoctorResponse getDoctor(String dName) {
		return doctorRepo.getDoctorResponse(dName);
	}
	

}
