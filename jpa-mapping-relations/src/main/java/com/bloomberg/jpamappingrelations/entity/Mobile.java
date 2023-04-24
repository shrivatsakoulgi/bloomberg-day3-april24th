package com.bloomberg.jpamappingrelations.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private long mobileNumber;
	private String operator;
	private Date validity;
		
	public Mobile() {
	}

	public Mobile(long mobileNumber, String operator, Date validity) {
		this.mobileNumber = mobileNumber;
		this.operator = operator;
		this.validity = validity;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Mobile [mobileNumber=" + mobileNumber + ", operator=" + operator + ", validity=" + validity + "]";
	}

}
