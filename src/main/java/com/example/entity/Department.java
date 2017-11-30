package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="department")
public class Department {
	@Id private long id;
	private String name;
}
