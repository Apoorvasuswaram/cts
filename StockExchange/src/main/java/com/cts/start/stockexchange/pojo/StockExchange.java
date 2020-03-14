package com.cts.start.stockexchange.pojo;
import javax.persistence.Id;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity



@Table(name = "stockExchange1")
public class StockExchange {
	@Id

	private Integer seid;
	private String stockexchange;

	private String brief;

	private Integer remarks;

	private String contact_address;

	public Integer getSeid() {
		return seid;
	}

	public void setSeid(Integer seid) {
		this.seid = seid;
	}

	public String getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public Integer getRemarks() {
		return remarks;
	}

	public void setRemarks(Integer remarks) {
		this.remarks = remarks;
	}

	public String getContact_address() {
		return contact_address;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	


}

