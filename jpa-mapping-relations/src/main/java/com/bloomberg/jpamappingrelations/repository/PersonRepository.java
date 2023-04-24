package com.bloomberg.jpamappingrelations.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bloomberg.jpamappingrelations.entity.Person;
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}
