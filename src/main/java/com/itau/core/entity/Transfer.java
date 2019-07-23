package com.itau.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transfer")
public class Transfer {
	@Id
	@Column(name="fromAccountId")	
    protected String fromAccountId;
	@Column(name="toAccountId")
	protected String toAccountId;
	@Column(name="message")
	protected String message;
	@Column(name="amount")
	protected Double amount;
  
    public Transfer() {
	    this.fromAccountId = "";
	    this.toAccountId = "";
	    this.message = "";
	    this.amount = 0.0;
    }
     
    public Transfer(String fromAccountId, String toAccountId, 
    			String message, Double amount) {
	    this.fromAccountId = fromAccountId;
	    this.toAccountId = toAccountId;
	    this.message = message;
	    this.amount = amount;
    }
    
    public String getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public String getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
