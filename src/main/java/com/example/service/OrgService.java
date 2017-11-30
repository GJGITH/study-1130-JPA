package com.example.service;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;

@Service
public class OrgService {
	//容器托管
	@PersistenceContext(unitName="jpa_link")
	EntityManager entityManager;
	
	/**
	 * 增加
	 * @param dept_id
	 * @param name
	 * @return
	 */
	@Transactional
	public Employee createEmployee(long dept_id,String name) {
		Employee emp = new Employee();
		emp.setId(2l);
		emp.setDeptId(dept_id);
		System.out.println("添加成功");
		return emp;
	}
	
	
	/*@Transactional
	public List<Employee> findEmployee() {
		Query query = (Query) entityManager;
		List<Employee> result = query.
	}	*/
	
}
