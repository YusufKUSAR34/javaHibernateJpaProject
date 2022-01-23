package com.javascourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import com.javascourse.project.hibernateAndJpa.Entities.City;

public interface ICityDal {
 
	  List<City> getAll();
	  void add(City city);
	  void update(City city);
	  void delete(City city);
	  City getByID(int id);
}
