package com.revature.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Penguin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private Integer numberOfLegs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penguin(Integer id, String name, Integer numberOfLegs) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Penguin [id=" + id + ", name=" + name + ", numberOfLegs=" + numberOfLegs + "]";
	}
	
}
