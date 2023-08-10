package com.international.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.international.bank.entity.Movements;
import com.international.bank.service.MovementService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping(path="/api/movements")
public class MovementController {
	@Autowired
	private MovementService service;
	
	@GetMapping("/find/{val}")
	public @ResponseBody Iterable<Movements> views(@PathVariable Integer val){
		return service.getMovementByIdClient(val);
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Movements> views(){
		return service.getall();
		//return repository.findAll();
	}
}
