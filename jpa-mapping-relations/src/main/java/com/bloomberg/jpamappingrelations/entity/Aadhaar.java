package com.bloomberg.jpamappingrelations.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// to avoid unnecessary serialization, Instructing the JPA to create object later (Lazy way)
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Aadhaar {
	@Id
	private long aadhaarNumber;
	private Date dateOfIssue;
	private String placeOfIssue;
	private String issuingAuthority;
		
	public Aadhaar() {
	}

	public Aadhaar(long aadhaarNumber, Date dateOfIssue, String placeOfIssue, String issuingAuthority) {
		this.aadhaarNumber = aadhaarNumber;
		this.dateOfIssue = dateOfIssue;
		this.placeOfIssue = placeOfIssue;
		this.issuingAuthority = issuingAuthority;
	}

	public long getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(long aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getPlaceOfIssue() {
		return placeOfIssue;
	}

	public void setPlaceOfIssue(String placeOfIssue) {
		this.placeOfIssue = placeOfIssue;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	@Override
	public String toString() {
		return "Aadhaar [aadhaarNumber=" + aadhaarNumber + ", dateOfIssue=" + dateOfIssue + ", placeOfIssue="
				+ placeOfIssue + ", issuingAuthority=" + issuingAuthority + "]";
	}
	
	
	

}
