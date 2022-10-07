package com.doctor.service;

import com.doctor.Entity.DoctorEntity;
import com.doctor.Entity.DoctorResponse;

public interface DoctorService {

	DoctorEntity addDoctor(DoctorEntity doctorEntity);

	DoctorResponse getDoctor(String dName);
}
