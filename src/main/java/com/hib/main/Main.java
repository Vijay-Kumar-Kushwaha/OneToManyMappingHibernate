package com.hib.main;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hib.entity.Student;
import com.hib.entity.StudentDetails;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("hitesh","hitesh@gmail.com",78887324);
		StudentDetails sd = new StudentDetails("mira road", "mumbai",110062);
		sd.setStudent(s);
		Session session = new Configuration().
								configure().
								addAnnotatedClass(Student.class).
								addAnnotatedClass(StudentDetails.class).
								buildSessionFactory().openSession();
		session.beginTransaction();
		session.persist(sd);
		session.getTransaction().commit();
		System.out.println("data Saved");
		
		//CODE TO FETCH THE DATA
//		Session session = new Configuration().
//							configure().
//							addAnnotatedClass(Student.class).
//							addAnnotatedClass(StudentDetails.class).
//							buildSessionFactory().openSession();
//		Student s1 = session.get(Student.class,202);
//		System.out.println(s1.getSid()+" "+s1.getName()+" "+s1.getEmail()+" "+s1.getMobile());
//		StudentDetails sd1 = s1.getStudentDetails();
//		System.out.println(sd1.getSdid()+" "+sd1.getArea()+" "+sd1.getCity()+" "+sd1.getPincode());
		
		
//		   // Create session and start transaction
//        Session session = new Configuration()
//                            .configure()
//                            .addAnnotatedClass(Student.class)
//                            .addAnnotatedClass(StudentDetails.class)
//                            .buildSessionFactory()
//                            .openSession();
//
//        // Fetch the student with sid = 202
//        Student studentToUpdate = session.get(Student.class, 202);
//
//        if (studentToUpdate != null) {
//            // Update the student's data
//            studentToUpdate.setName("advay");
//            studentToUpdate.setEmail("advay@gmail.com");
//            studentToUpdate.setMobile(99996789);
//
//            // Start the transaction
//            session.beginTransaction();
//
//            // Save the updated student
//            session.saveOrUpdate(studentToUpdate);
//
//            // Commit the transaction
//            session.getTransaction().commit();
//
//            System.out.println("Student data updated successfully.");
//        } else {
//            System.out.println("Student with SID 202 not found.");
//        }
//
//        // Close the session
//        session.close();
		
		
		
//		// Create session and start transaction
//        Session session = new Configuration()
//                            .configure()
//                            .addAnnotatedClass(Student.class)
//                            .addAnnotatedClass(StudentDetails.class)
//                            .buildSessionFactory()
//                            .openSession();
//        
//        // Fetch the student with sid = 202
//        Student studentToDelete = session.get(Student.class, 202);
//
//        if (studentToDelete != null) {
//            // Start the transaction
//            session.beginTransaction();
//
//            // Delete the student
//            session.delete(studentToDelete);
//
//            // Commit the transaction
//            session.getTransaction().commit();
//
//            System.out.println("Student with SID 202 deleted successfully.");
//        } else {
//            System.out.println("Student with SID 202 not found.");
//        }
//
//        // Close the session
//        session.close();
		
	}
}