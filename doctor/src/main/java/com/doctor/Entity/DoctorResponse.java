package com.doctor.Entity;

public class DoctorResponse {

	private String doctorName;
	private String specialization;
	private Integer patient_count;

	public DoctorResponse(String doctorName, String specialization, Integer patient_count) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.patient_count = patient_count;
	}

	public DoctorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DoctorResponse [doctorName=" + doctorName + ", specialization=" + specialization + ", patient_count="
				+ patient_count + "]";
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
