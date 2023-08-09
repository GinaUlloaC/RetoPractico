package com.international.bank.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {	
	@Id
	Integer id;
	String name;
	String lastname;
	Integer age;
	Long account;
	LocalDate date;
	Boolean isEmployee;
	String appointment;
	Integer numberClient;
	Double balanceAccount;
	

	public Client() {
		super();
	}
		
	public Client(Integer id, String name, String lastname,Integer age, Long account, LocalDate date, Integer numberClient, Boolean isEmployee, String appointment, Double balanceAccount) {
		super();
		this.id=id;
		this.name=name;
		this.account=account;
		this.lastname=lastname;
		this.age=age;
		this.date=date;
		this.isEmployee=isEmployee;
		this.appointment=appointment;
		this.numberClient=numberClient;
		this.balanceAccount=balanceAccount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getAccount() {
		return account;
	}

	public void setAccount(Long account) {
		this.account = account;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getNumberClient() {
		return numberClient;
	}

	public void setNumberClient(Integer numberClient) {
		this.numberClient = numberClient;
	}
	public Boolean getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(Boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public Double getBalanceAccount() {
		return balanceAccount;
	}

	public void setBalanceAccount(Double balanceAccount) {
		this.balanceAccount = balanceAccount;
	}
	
}
