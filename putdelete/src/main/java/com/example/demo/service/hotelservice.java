package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hotelmodel.hotelmodel;
import com.example.demo.repo.hotelrepo;

@Service
public class hotelservice {
	@Autowired
public hotelrepo hrepo;
	
	//post the data//
	public String saveHotel(hotelmodel h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get the data//
	public List<hotelmodel> getHotel()
	{
		return hrepo.findAll();
		
	}
	
	//update the data(put)//
	public hotelmodel updateHotel(hotelmodel h)
	{
		return hrepo.saveAndFlush(h);
	}
	
	//delete mapping//
	public void deleteHotel(int h)
	{
		System.out.println("Delete");
		hrepo.deleteById(h);
	}
}


