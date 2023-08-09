package com.international.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.international.bank.entity.Movements;
import com.international.bank.repository.IMovementRepository;


@Service
public class MovementService implements IMovementService{

	@Autowired
	private IMovementRepository repository;
	
	@Override
	public Iterable<Movements> getMovementByIdClient(Integer val) {
		return repository.findByIdClient(val);
	}

	@Override
	public Iterable<Movements> getall() {
		return repository.findAll();
	}
	
}
