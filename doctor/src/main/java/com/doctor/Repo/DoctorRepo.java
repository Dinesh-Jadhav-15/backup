package com.doctor.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.doctor.Entity.DoctorEntity;
import com.doctor.Entity.DoctorResponse;

public interface DoctorRepo extends JpaRepository<DoctorEntity, Integer> {
	@Query("SELECT new com.doctor.Entity.DoctorResponse(r.doctorName,r.specialization,r.patient_count )"
			+ "FROM DoctorEntity r where r.doctorName = :n")
	public DoctorResponse getDoctorResponse(@Param("n") String dname);
}
