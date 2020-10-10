package com.umermahmood.dojosninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umermahmood.dojosninjas.models.Ninja;
import com.umermahmood.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	// Initializing the repository
	
	
	public ArrayList<Ninja> getAll(){
		return (ArrayList<Ninja>) ninjaRepository.findAll();
	}
	// Getting all ninjas and returning them
	
	public Ninja getOneById(Long id) {
		var ninja = ninjaRepository.findById(id);
		
		return ninja!= null ? ninja.get(): new Ninja();
	}
	// Getting one ninja
	
	public void createNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	// Creating a ninja
	
	public void updateNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	// Updating a ninja
	
	public void deleteNinja(Long id) {
		var nijaToBedeletyed = ninjaRepository.findById(id);
		if(nijaToBedeletyed!=null)
			ninjaRepository.delete(nijaToBedeletyed.get());
	}
	// Deleting a ninja
	

}
