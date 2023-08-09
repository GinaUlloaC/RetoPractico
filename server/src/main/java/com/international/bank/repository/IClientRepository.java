package com.international.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.international.bank.entity.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
	@Query("SELECT c FROM Client c WHERE c.numberClient = :numberClient")
	List<Client> findByNumberClient(@Param("numberClient") Integer numberClient);
}
