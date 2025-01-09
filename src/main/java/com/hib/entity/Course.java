package com.hib.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cid")
	private int cid;
	@Column(name = "name")
	private String name;
	@Column(name = "hours")
	private int hours;
	
    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;
    
    
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Course(int cid, String name, int hours) {
		super();
		this.cid = cid;
		this.name = name;
		this.hours = hours;
	}
	public Course(String name, int hours) {
		super();
		this.name = name;
		this.hours = hours;
	}
	public Course() {
		super();
	}
	
	
	
}
