package com.hib.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Course;
import com.hib.entity.Student;
import com.hib.entity.StudentDetails;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Dhoni","dhoni@gmail.com",6668774);
		StudentDetails sd = new StudentDetails("Nehru nagar", "ranhci",155562);
		s.setStudentDetails(sd);
		
		Student s1 = new Student("Bumrah","boom@gmail.com",9668774);
		StudentDetails sd1 = new StudentDetails("amritsar", "Punjba",155562);
		s1.setStudentDetails(sd1);
		Course c1 = new Course("Java", 150);
		Course c2 = new Course("Python", 150);
		
		Course c3 = new Course("Java", 150);
		Course c4 = new Course("Python", 150);
		s.addCourse(c1);
		s.addCourse(c2);
		
		s1.addCourse(c3);
		s1.addCourse(c4);
		

		Session session = new Configuration().
								configure().
								addAnnotatedClass(Student.class).
								addAnnotatedClass(Course.class).
								addAnnotatedClass(StudentDetails.class).
								buildSessionFactory().openSession();
		try {
		    session.beginTransaction();
		    System.out.println("Transaction begin.......................................");
		    session.persist(s);
		    session.persist(s1);
		    System.out.println("session save");
		    session.getTransaction().commit();
		    System.out.println("got transaction and commited.......................................");
		} catch (Exception e) {
		    e.printStackTrace();
		    session.getTransaction().rollback();
		}
		System.out.println("data Saved.......................................");
		
	}
}

