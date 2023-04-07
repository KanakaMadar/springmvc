package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import Dto.PatientDto;

@Component
public class PatientDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
public void insert(PatientDto dto1) {
	// TODO Auto-generated method stub
	et.begin();
	em.persist(dto1);
	et.commit();
}
//******************fetch****************************
public PatientDto fetch(int id) {
	// TODO Auto-generated method stub
	PatientDto dto1=em.find(PatientDto.class,id);
	return dto1;
}
}
