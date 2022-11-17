package com.ty.StudentDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.StudentDTO.Student;



public class StudentDao {


	public Student saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();


		return student;

	}



	public Student getStudentByEmail(String email) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select s from Student s where s.email=?1 ");
		return (Student) query.setParameter(1, email).getSingleResult();
	}




	public List<Student> getStudentDeatil() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("select s from Student s");

		List<Student> student = query.getResultList();

		return student;


	}

	public Student findById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return	entityManager.find(Student.class, id);

	}
	public Student DeleteStudentById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student =	entityManager.find(Student.class, id);
		entityTransaction.begin();
		
		entityManager.remove(student);
		entityTransaction.commit();
		
		return student;
		
		

	}

}
