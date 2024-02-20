package com.javaPolymorphism;


//sub class
public class Patient extends Address
{
	
	//fields
	private int patientId;
	private String patientName;
	private String patientProblem;
	private double patientBill;
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Patient(int patientId, String patientName, String patientProblem, double patientBill) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientProblem = patientProblem;
		this.patientBill = patientBill;
	}



	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}

	public void setPatientBill(double patientBill) {
		this.patientBill = patientBill;
	}

	public String getDetails() //overrides com.javaPolymorphism.Address.getDetails
	{
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientProblem=" + patientProblem
				+ ", patientBill=" + patientBill + "]";//logic
	}
	

}
