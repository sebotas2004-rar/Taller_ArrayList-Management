package co.edu.uptc.models;

public class Student {
private String firstName;
private String lastName;
private String idStudent;
private int currentSemester;
private int age;

public Student() {
	super();
}

public Student(String firstName, String lastName, String idStudent, int currentSemester, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.idStudent = idStudent;
	this.currentSemester = currentSemester;
	this.age = age;
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

public String getIdStudent() {
	return idStudent;
}

public void setIdStudent(String idStudent) {
	this.idStudent = idStudent;
}

public int getCurrentSemester() {
	return currentSemester;
}

public void setCurrentSemester(int currentSemester) {
	this.currentSemester = currentSemester;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



}
