package co.edu.uptc.models;

import java.time.LocalDate;

public class Rector {

	private String employeedId;
	private String academicTitle;
	private boolean workStatus;
	private String recName;
	private LocalDate appointmentDate;
	
	public Rector() {
		super();
	}

	public Rector(String employeedId, String academicTitle, boolean workStatus,  String recName,
			LocalDate appointmentDate) {
		super();
		this.employeedId = employeedId;
		this.academicTitle = academicTitle;
		this.workStatus = workStatus;
		this.recName = recName;
		this.appointmentDate = appointmentDate;
	}

	public String getEmployeedId() {
		return employeedId;
	}

	public void setEmployeedId(String employeedId) {
		this.employeedId = employeedId;
	}

	public String getAcademicTitle() {
		return academicTitle;
	}

	public void setAcademicTitle(String academicTitle) {
		this.academicTitle = academicTitle;
	}

	public boolean isWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(boolean workStatus) {
		this.workStatus = workStatus;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	
}
