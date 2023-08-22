package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.hotelmodel.hotelmodel;
import com.example.demo.service.hotelservice;

@RestController
public class Controller {
	@Autowired
	public hotelservice hserv;
	
	//post mapping//
	@PostMapping("/postHotel")
	public String postHotel(@RequestBody hotelmodel hr)
	{
		hserv.saveHotel(hr);
		return "Data is  saved to the database";
	}
	//get Mapping//
	@GetMapping("/getHotel")
	public List<hotelmodel> getHotelInfo()
	{
		return hserv.getHotel();
	}
	//put mapping//
	@PutMapping("/putHotel")
	public hotelmodel updateHotelInfo(@RequestBody hotelmodel ha)
	{
		return hserv.updateHotel(ha);
	}
	@DeleteMapping("/delhotel/{id}")
	public String deletehotel(@PathVariable("id") int hid )
	{
		hserv.deleteHotel(hid);	
		return "Hotel with ID "+hid+" is deleted";
		}
}

	


