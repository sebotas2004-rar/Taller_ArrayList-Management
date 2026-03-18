package co.edu.uptc.models;

public class Teacher {

	private String firstName;
	private String lastName;
	private String idCode;
	private String contractType;
	private boolean teachingStatus;
	public Teacher() {
		super();
	}
	public Teacher(String firstName, String lastName, String idCode, String contractType, boolean teachingStatus) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idCode = idCode;
		this.contractType = contractType;
		this.teachingStatus = teachingStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdCode() {
		return idCode;
	}
	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public boolean isTeachingStatus() {
		return teachingStatus;
	}
	public void setTeachingStatus(boolean teachingStatus) {
		this.teachingStatus = teachingStatus;
	}
	
	
}
