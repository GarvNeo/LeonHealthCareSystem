package com.capg.healthcarecomplete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.capg.healthcarecomplete.dto.CenterRequest;
import com.capg.healthcarecomplete.entity.*;
import com.capg.healthcarecomplete.repositories.AppointmentRepository;
import com.capg.healthcarecomplete.repositories.CenterRepository;
import com.capg.healthcarecomplete.repositories.TestRepository;
import com.capg.healthcarecomplete.service.CednterService;
import com.capg.healthcarecomplete.repositories.AppUserRepository;

@RestController
public class ApplicationController {
    
	@Autowired
	private AppointmentRepository appointmentRepository; 
	
	@Autowired
	private CenterRepository centerRepository; 
	
	@Autowired
	private TestRepository testRepository; 
	
	@Autowired
	private AppUserRepository appUserRepository; 
	
	@PostMapping("/makeCenter")
	public Center addCenter(@RequestBody CenterRequest req){
		return centerRepository.save(req.getCenter());
	}
	
	@Autowired
	CednterService service;
	
	@RequestMapping("/list")
	public List<Center> ProductList(Model theModel)
	{
		
		List<Center> prod = service.getAllProducts();
		theModel.addAttribute("Products", prod);
		System.out.println("List of Products : "+prod);
		return prod;		
	}
	
	@GetMapping("/findAllCenter")
	public List<Center> findAllCenter(){
		return centerRepository.findAll();
	}
}
