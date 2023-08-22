package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hotelmodel.hotelmodel;

public interface hotelrepo extends JpaRepository<hotelmodel,Integer> {

}
