package com.hib.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int sid;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private int mobile;
	
	
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	@JoinColumn(name = "sdid")
	private StudentDetails studentDetails;
	
	
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
	public Student(int sid, String name, String email, int mobile) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	public Student(String name, String email, int mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	public Student() {
		super();
	}
	

}
