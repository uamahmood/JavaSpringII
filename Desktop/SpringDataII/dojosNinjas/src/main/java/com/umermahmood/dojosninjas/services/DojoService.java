package com.umermahmood.dojosninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umermahmood.dojosninjas.models.Dojo;
import com.umermahmood.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	// Initializing the repository interface
	
	public ArrayList<Dojo> getAll(){
		return (ArrayList<Dojo>) dojoRepository.findAll();
	}
	// Getting all dojos
	
	public Dojo getOneById(Long id) {
		var data = dojoRepository.findById(id);
		return data!= null? data.get(): new Dojo() ;
	}
	// Getting one dojo
	
	public void createDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	// Creating a dojo and saving it to the database
	
	public void updateDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	// Updating a dojo
	
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
	// Delete a dojo by id
	
}

