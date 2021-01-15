package com.vagiannis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kuber_employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idkuber_employees")
	private int idkuber_employees;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="windows_login")
	private String windows_login;
	
	@Column(name="windows_passwrd")
	private String windows_passwrd;
	
	@Column(name="email")
	private String email;
	
	@Column(name="department")
	private String department;
	
	@Column(name="door")
	private int door;
	
	@Column(name="kpc")
	private int kpc;
	
	@Column(name="phone")
	private int phone;
	
	@Column(name="printer_pin")
	private int printer_pin;
	 
	public Employee(){
	
	
}

	public int getIdkuber_employees() {
		return idkuber_employees;
	}

	public void setIdkuber_employees(int idkuber_employees) {
		this.idkuber_employees = idkuber_employees;
	}

	public String getFirst_name() {
		return first_name;
	}
	public int getPrinter_pin() {
		return printer_pin;
	}

	public void setPrinter_pin(int printer_pin) {
		this.printer_pin = printer_pin;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getWindows_login() {
		return windows_login;
	}

	public void setWindows_login(String windows_login) {
		this.windows_login = windows_login;
	}

	public String getWindows_passwrd() {
		return windows_passwrd;
	}

	public void setWindows_passwrd(String windows_passwrd) {
		this.windows_passwrd = windows_passwrd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getKpc() {
		return kpc;
	}

	public void setKpc(int kpc) {
		this.kpc = kpc;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [idkuber_employees=" + idkuber_employees + ", first_name=" + first_name + ", last_name="
				+ last_name + ", windows_login=" + windows_login + ", windows_passwrd=" + windows_passwrd + ", email="
				+ email + ", department=" + department + ", door=" + door + ", kpc=" + kpc + ", phone=" + phone + "]";
	}
	
}
