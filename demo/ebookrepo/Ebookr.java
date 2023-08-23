package com.example.demo.ebookrepo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ebookmodel.Ebookm;
@Repository
public interface Ebookr extends JpaRepository<Ebookm,Integer> {


}
