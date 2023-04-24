package com.bloomberg.jpamappingrelations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloomberg.jpamappingrelations.entity.Person;
import com.bloomberg.jpamappingrelations.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person getPersonById(int personId) {	
		return personRepository.findById(personId).get();
	}

	@Override
	public List<Person> getPeople() {	
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public void addPerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public void deletePersonById(int personId) {		
		personRepository.deleteById(personId);
	}

	@Override
	public void updatePerson(int personId, Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);

	}

}
