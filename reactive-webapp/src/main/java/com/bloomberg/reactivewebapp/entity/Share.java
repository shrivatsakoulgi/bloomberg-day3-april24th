package com.bloomberg.reactivewebapp.entity;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Share {
	@Id
	@JsonIgnore
	private int shareId;
	private String shareName;
	private double sharePrice;
	private double equityDebtRatio;
	private double totalInvestmentsInCrores;

	public Share() {

	}

	public Share(int shareId, String shareName, double sharePrice, double equityDebtRatio,
			double totalInvestmentsInCrores) {
		this.shareId = shareId;
		this.shareName = shareName;
		this.sharePrice = sharePrice;
		this.equityDebtRatio = equityDebtRatio;
		this.totalInvestmentsInCrores = totalInvestmentsInCrores;
	}


	public int getShareId() {
		return shareId;
	}


	public void setShareId(int shareId) {
		this.shareId = shareId;
	}


	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getEquityDebtRatio() {
		return equityDebtRatio;
	}

	public void setEquityDebtRatio(double equityDebtRatio) {
		this.equityDebtRatio = equityDebtRatio;
	}

	public double getTotalInvestmentsInCrores() {
		return totalInvestmentsInCrores;
	}

	public void setTotalInvestmentsInCrores(double totalInvestmentsInCrores) {
		this.totalInvestmentsInCrores = totalInvestmentsInCrores;
	}

	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}


	@Override
	public String toString() {
		return "Share [shareId=" + shareId + ", shareName=" + shareName + ", sharePrice=" + sharePrice
				+ ", equityDebtRatio=" + equityDebtRatio + ", totalInvestmentsInCrores=" + totalInvestmentsInCrores
				+ "]";
	}


}
