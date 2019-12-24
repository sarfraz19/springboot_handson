package com.sarfraz.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sarfraz.demo.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
	
}
