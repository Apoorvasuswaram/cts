package com.cts.start.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "company")
public class Company {
@Id
private String companyname;
private Integer turnover;
private String ceo;
private String boardofdirectors;
private String listinstock;
private String sector;
private String briefwriteup;
private String stockcode;
	@Override
public String toString() {
	return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceo=" + ceo + ", boardofdirectors="
			+ boardofdirectors + ", listinstock=" + listinstock + ", sector=" + sector + ", briefwriteup=" + briefwriteup
			+ ", stockcode=" + stockcode + "]";
}
	
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardofdirectors() {
		return boardofdirectors;
	}
	public void setBoardofdirectors(String boardofdirectors) {
		this.boardofdirectors = boardofdirectors;
	}
	public String getListinstock() {
		return listinstock;
	}
	public void setListinstock(String listinstock) {
		this.listinstock = listinstock;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefwriteup() {
		return briefwriteup;
	}
	public void setBriefwriteup(String briefwriteup) {
		this.briefwriteup = briefwriteup;
	}
	public String getStockcode() {
		return stockcode;
	}
	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}
	
}
