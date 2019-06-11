package com.aravind.cryptoCurrency.model;

public class Currencies {
	private String id;
	private String fullName;
	private String ask;
	private String bid;
	private String last;
	private String open;
	private String low;
	private String high;
	private String feeCurrency;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getAsk() {
		return ask;
	}

	public String getBid() {
		return bid;
	}

	public String getLast() {
		return last;
	}

	public String getOpen() {
		return open;
	}

	public String getLow() {
		return low;
	}

	public String getHigh() {
		return high;
	}

	public String getFeeCurrency() {
		return feeCurrency;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setAsk(String ask) {
		this.ask = ask;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}
}