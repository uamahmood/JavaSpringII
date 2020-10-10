package com.umermahmood.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.umermahmood.driverslicense.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}
