package com.bloomberg.jpamappingrelations.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue 	// id is automatically generated. // No need to give in JSON(input)
	private int personId;
	private String name;
	private Date dateOfBirth;
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn		// name of the Aadhaar field in Person table
	private Aadhaar aadhaar;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Mobile> mobiles;
	 
	//Change in Constructor
	public Person(String name, Date dateOfBirth, String gender) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public Person() {
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Aadhaar getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}
	public List<Mobile> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", aadhaar=" + aadhaar + ", mobiles=" + mobiles + "]";
	}

}
	
	
	


