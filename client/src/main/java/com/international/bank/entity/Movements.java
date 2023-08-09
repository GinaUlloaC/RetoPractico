package com.international.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movements")
public class Movements {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String typeMovement;
	Double value;
	String detail;
	Integer idClient;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeMovement() {
		return typeMovement;
	}

	public void setTypeMovement(String typeMovement) {
		this.typeMovement = typeMovement;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	
	
}
