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
@Table(name="student_details")
public class StudentDetails {
	
	@Id
	@Column(name="sdid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sdid;
	@Column(name="area")
	private String area;
	@Column(name="city")
	private String city;
	@Column(name="pincode")
	private int pincode;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid")
	private Student student; 
	
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public int getSdid() {
		return sdid;
	}
	public void setSdid(int sdid) {
		this.sdid = sdid;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public StudentDetails(int sdid, String area, String city, int pincode) {
		super();
		this.sdid = sdid;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	public StudentDetails(String area, String city, int pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	
	public StudentDetails() {
		super();
	}
	
	
	
}
