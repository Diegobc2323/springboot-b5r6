package com.springb5r6.model;

public class PersonDTO {

	private String firstName;
	private String secondName;
	private String dateOfBirth;
	private String profession;
	private int salary;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PersonDTO [firstName=" + firstName + ", secondName=" + secondName + ", dateOfBirth=" + dateOfBirth
				+ ", profession=" + profession + ", salary=" + salary + "]";
	}
	
	
}
