package com.fly.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trNo;
	
	private String cardNo;
	
	private String upiid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private BookedFlight bookedFlight;
	public int getTrNo() {
		return trNo;
	}
	public void setTrNo(int trNo) {
		this.trNo = trNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getUpiid() {
		return upiid;
	}
	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}
	public BookedFlight getBookedFlight() {
		return bookedFlight;
	}
	public void setBookedFlight(BookedFlight bookedFlight) {
		this.bookedFlight = bookedFlight;
	}
	

}
