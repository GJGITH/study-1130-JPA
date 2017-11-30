package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.service.OrgService;

@SpringBootApplication
public class SpringJpaApplication {

	@Autowired
	OrgService orgservice;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("orgService");
		EntityManager em = emf.createEntityManager();
		Employee emp = new Employee();
		em.persist(emp);*/
		OrgService org = new OrgService();
		org.createEmployee(1, "CDE");
	}
	/*@Bean
	public Org*/
	
}
