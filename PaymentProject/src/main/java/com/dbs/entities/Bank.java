package com.dbs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="bank")
public class Bank {
	@Id
	String bic;
	String name;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String bic, String name) {
		super();
		this.bic = bic;
		this.name = name;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BankBICEntity [bic=" + bic + ", name=" + name + "]";
	}
	
}
