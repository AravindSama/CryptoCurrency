package com.aravind.cryptoCurrency.model;

public class CurrencyConversion {
	private String id;
	private String fullName;
	private boolean crypto;
	private boolean payinEnabled;
	private boolean payinPaymentId;
	private float payinConfirmations;
	private boolean payoutEnabled;
	private boolean payoutIsPaymentId;
	private boolean transferEnabled;
	private boolean delisted;
	private String payoutFee;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public boolean getCrypto() {
		return crypto;
	}

	public boolean getPayinEnabled() {
		return payinEnabled;
	}

	public boolean getPayinPaymentId() {
		return payinPaymentId;
	}

	public float getPayinConfirmations() {
		return payinConfirmations;
	}

	public boolean getPayoutEnabled() {
		return payoutEnabled;
	}

	public boolean getPayoutIsPaymentId() {
		return payoutIsPaymentId;
	}

	public boolean getTransferEnabled() {
		return transferEnabled;
	}

	public boolean getDelisted() {
		return delisted;
	}

	public String getPayoutFee() {
		return payoutFee;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setCrypto(boolean crypto) {
		this.crypto = crypto;
	}

	public void setPayinEnabled(boolean payinEnabled) {
		this.payinEnabled = payinEnabled;
	}

	public void setPayinPaymentId(boolean payinPaymentId) {
		this.payinPaymentId = payinPaymentId;
	}

	public void setPayinConfirmations(float payinConfirmations) {
		this.payinConfirmations = payinConfirmations;
	}

	public void setPayoutEnabled(boolean payoutEnabled) {
		this.payoutEnabled = payoutEnabled;
	}

	public void setPayoutIsPaymentId(boolean payoutIsPaymentId) {
		this.payoutIsPaymentId = payoutIsPaymentId;
	}

	public void setTransferEnabled(boolean transferEnabled) {
		this.transferEnabled = transferEnabled;
	}

	public void setDelisted(boolean delisted) {
		this.delisted = delisted;
	}

	public void setPayoutFee(String payoutFee) {
		this.payoutFee = payoutFee;
	}
}
