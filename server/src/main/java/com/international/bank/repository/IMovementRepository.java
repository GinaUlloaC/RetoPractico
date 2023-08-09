package com.international.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.international.bank.entity.Movements;

@Repository
public interface IMovementRepository extends JpaRepository<Movements, Integer>{
	@Query("SELECT t FROM Movements t WHERE t.idClient = :idClient")
    List<Movements> findByIdClient(@Param("idClient") Integer idClient);
}
