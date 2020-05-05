package com.capg.healthcarecomplete.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.healthcarecomplete.entity.Center;
import com.capg.healthcarecomplete.repositories.CenterRepository;

@Service
public class CednterService {

	@Autowired
	CenterRepository centerRepository;

	
	public List<Center> getAllProducts() {
		List<Center> pList=new ArrayList<Center>();
		centerRepository.findAll().forEach(product1 -> pList.add(product1));
		return pList;
	}
}
