package com.international.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.international.bank.entity.Client;
import com.international.bank.service.ClientService;

@Controller
@RequestMapping(path="/clients")
public class ClientController {
	@Autowired
	private ClientService service;

	
	@GetMapping("/client/{val}")
	public @ResponseBody Optional<Client> views(@PathVariable Integer val){
		return service.getCLientById(val);
	}
	
	@GetMapping("/find/{val}")
	public @ResponseBody Iterable<Client> find(@PathVariable Integer val){
		return service.getClientByNumberClient(val);
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Client> views(){
		return service.getall();
	}
}
