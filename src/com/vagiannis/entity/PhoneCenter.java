package com.vagiannis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kuber_phones")
public class PhoneCenter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idkuber_phones")
	private int idkuber_phones;
	
	@Override
	public String toString() {
		return "PhoneCenter [idkuber_phones=" + idkuber_phones + ", port=" + port + ", name_appeared=" + name_appeared
				+ ", incoming=" + incoming + "]";
	}

	public int getIdkuber_phones() {
		return idkuber_phones;
	}

	public void setIdkuber_phones(int idkuber_phones) {
		this.idkuber_phones = idkuber_phones;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName_appeared() {
		return name_appeared;
	}

	public void setName_appeared(String name_appeared) {
		this.name_appeared = name_appeared;
	}

	public String getIncoming() {
		return incoming;
	}

	public void setIncoming(String incoming) {
		this.incoming = incoming;
	}

	@Column(name="port")
	private String port;
	
	@Column(name="name_appeared")
	private String name_appeared;
	
	@Column(name="incoming")
	private String incoming;
	
	
}
