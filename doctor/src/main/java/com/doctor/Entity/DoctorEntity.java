package com.doctor.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DoctorEntity {
	@Id
	@GeneratedValue
	private int doctorId;
	private String doctorName;
	private Integer doctorAge;
	private String doctorGender;
	private String specialization;
	private Integer patient_count;

	public DoctorEntity(int doctorId, String doctorName, Integer doctorAge, String doctorGender, String specialization,
			Integer patient_count) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.specialization = specialization;
		this.patient_count = patient_count;
	}

	public DoctorEntity() {
		super();
	}

	@Override
	public String toString() {
		return "DoctorEntity [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", specialization=" + specialization + ", patient_count="
				+ patient_count + "]";
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Integer getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(Integer doctorAge) {
		this.doctorAge = doctorAge;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getPatient_count() {
		return patient_count;
	}

	public void setPatient_count(Integer patient_count) {
		this.patient_count = patient_count;
	}

}
