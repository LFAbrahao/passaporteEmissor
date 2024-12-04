package com.senac.passaporte.emissor.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passaporte implements Serializable {
	
	@Id
	@GeneratedValue
	private int passaporteID;
	
	private int passaporteStatus;

	public int getPassaporteID() {
		return passaporteID;
	}

	public void setPassaporteID(int passaporteID) {
		this.passaporteID = passaporteID;
	}

	public int getPassaporteStatus() {
		return passaporteStatus;
	}

	public void setPassaporteStatus(int passaporteStatus) {
		this.passaporteStatus = passaporteStatus;
	}
	
	
}
