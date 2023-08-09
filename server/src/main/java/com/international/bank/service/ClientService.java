package com.international.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.international.bank.entity.Client;
import com.international.bank.repository.IClientRepository;


@Service
public class ClientService implements IClientService{

	@Autowired
	private IClientRepository repository;
	
	@Override
	public Optional<Client> getCLientById(Integer val) {
		return repository.findById(val);
	}
	
	@Override
	public Iterable<Client> getall(){
		return repository.findAll();
	}

	@Override
	public Iterable<Client> getClientByNumberClient(Integer val) {
		return repository.findByNumberClient(val);
	}
}
