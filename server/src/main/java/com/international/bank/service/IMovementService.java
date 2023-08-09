package com.international.bank.service;

import com.international.bank.entity.Movements;


public interface IMovementService {

	public abstract Iterable<Movements> getMovementByIdClient(Integer val);
	
	public Iterable<Movements> getall();
}
