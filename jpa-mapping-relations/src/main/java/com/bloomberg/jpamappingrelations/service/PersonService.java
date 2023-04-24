package com.bloomberg.jpamappingrelations.service;

import java.util.List;

import com.bloomberg.jpamappingrelations.entity.Person;

public interface PersonService {
	
	Person getPersonById(int personId);
	List<Person> getPeople();
	void addPerson(Person person);
	void deletePersonById(int personId);
	void updatePerson(int personId, Person person);

}
