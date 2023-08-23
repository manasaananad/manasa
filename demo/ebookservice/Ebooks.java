package com.example.demo.ebookservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ebookmodel.Ebookm;
import com.example.demo.ebookrepo.Ebookr;

@Service
public class Ebooks {
@Autowired
Ebookr repo;
public Ebookm saveDetails(Ebookm ep) {
	return repo.save(ep);
}
public List<Ebookm> getDetails(){
	return repo.findAll();
}
public Ebookm updateDetails(Ebookm ph) {
	return repo.saveAndFlush(ph);
}
public void deleteDetails(int id) {
	System.out.print("Batch Id is deleted");
	repo.deleteById(id);
}
public boolean checkdelete(int id) {
	if(repo.existsById(id)) {
		{
			repo.deleteById(id);
		    System.out.print("The given Batch Id is deleted");
		   return true;
		}
	}
return false;
}
public Optional<Ebookm> updateUserById(int id){
	Optional<Ebookm> hp=repo.findById(id);
	if(hp.isPresent()) {
		return hp;
	}
	return null;
}
}

