package com.example.SpringTest2.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "NewAccounts")
public class Account {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
	private Long accountId;
    
    @Column(name="Name")
    private String name;
    
    @Column(name="Em@il")
    private String email;
    
    @Column(name="Bills")
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Bill> bills;

	public Account(String name, String email, List<Bill> bills) {
		super();
		this.name = name;
		this.email = email;
		this.bills = bills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Long getAccountId() {
		return accountId;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
