package com.bloomberg.jpamappingrelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloomberg.jpamappingrelations.entity.Person;
import com.bloomberg.jpamappingrelations.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@GetMapping("/person/{personId}")
	public Person getPersonById(@PathVariable int personId) {
		return personService.getPersonById(personId);
	}

	@GetMapping("/people")
	public List<Person> getPeople(){
		return personService.getPeople();
	}
	
	@PostMapping("/person")
	public ResponseEntity<String> addPerson(@RequestBody Person person){
		personService.addPerson(person);
		return new ResponseEntity<String>("Person Added successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/person/{personId}")
	public ResponseEntity<String> deletePersonById(@PathVariable int personId){
		personService.deletePersonById(personId);
		return new ResponseEntity<String>("Person Deleted successfully..",HttpStatus.OK);
	}
}
