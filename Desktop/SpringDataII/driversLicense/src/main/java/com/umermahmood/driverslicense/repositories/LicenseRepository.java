package com.umermahmood.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.umermahmood.driverslicense.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{

}
