package com.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.service.OrgService;

public class OrgServiceTest {

	/*@Autowired
	OrgService orgservice;*/
	
	public static void main(String[] args) {
		OrgService orgService = new OrgService();
		orgService.createEmployee(2l, "CDE");
	}

}
