package com.international.bank.service;

import java.util.Optional;

import com.international.bank.entity.Client;


public interface IClientService {
	
	public abstract Optional<Client> getCLientById(Integer val);
	
	public Iterable<Client> getall();

	public abstract Iterable<Client> getClientByNumberClient(Integer val);
}
