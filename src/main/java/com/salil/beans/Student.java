package com.salil.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private long studentId;
	private String firstName;
	private String lastName;
	
	public Student() {
	}

	public Student(final String firstName, final String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
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
	
	@Override
	public String toString() {
		ToStringBuilder toStringBuilder = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE);
		toStringBuilder.append("studentId", studentId);
		toStringBuilder.append("fistName",firstName);
		toStringBuilder.append("lastName",lastName);
		return toStringBuilder.toString();
	}
}
