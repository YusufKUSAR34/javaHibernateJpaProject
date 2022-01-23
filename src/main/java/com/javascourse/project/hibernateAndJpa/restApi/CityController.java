package com.javascourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javascourse.project.hibernateAndJpa.Business.ICityService;
import com.javascourse.project.hibernateAndJpa.Entities.City;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {

	private ICityService cityService;
   @Autowired
	public CityController(ICityService cityService) {
		
		this.cityService = cityService;
	}
 
   @GetMapping("/cities")
   public List<City> get()
   {
         return cityService.getAll();
   }
   @PostMapping("/add")
   public void add(@RequestBody City city)
   {
	   this.cityService.add(city);
   }
   @PostMapping("/update")
   public void update(@RequestBody City city)
   {
	   this.cityService.update(city);
   }
   @PostMapping("/delete")
   public void delete(@RequestBody City city)
   {
	   this.cityService.delete(city);
   }
   @GetMapping("/cities/{id}")
   public City getById(@PathVariable int id)
   {
	   return this.cityService.getById(id);
   }
	
}
