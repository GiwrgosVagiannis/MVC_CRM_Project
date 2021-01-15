package com.vagiannis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kuber_pc")
public class Computer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pc")
	private int id_pc;
	
	@Column(name="pc_name")
	private String pc_name;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="cpu")
	private String cpu;
	
	@Column(name="ssd")
	private String ssd;
	
	@Column(name="date_acquired")
	private String date_acquired;
	
	@Column(name="ip")
	private String ip;

	public int getId_pc() {
		return id_pc;
	}

	public void setId_pc(int id_pc) {
		this.id_pc = id_pc;
	}

	public String getPc_name() {
		return pc_name;
	}

	public void setPc_name(String pc_name) {
		this.pc_name = pc_name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "Computer [id_pc=" + id_pc + ", pc_name=" + pc_name + ", ram=" + ram + ", cpu=" + cpu + ", ssd=" + ssd
				+ ", ip=" + ip + "]";
	}

	public Computer() {
		
	}

	public String getDate_acquired() {
		return date_acquired;
	}

	public void setDate_acquired(String date_acquired) {
		this.date_acquired = date_acquired;
	}
	
	

}
