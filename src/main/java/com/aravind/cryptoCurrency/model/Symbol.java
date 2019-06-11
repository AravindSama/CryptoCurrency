package com.aravind.cryptoCurrency.model;

public class Symbol {
	private String id;
	private String baseCurrency;
	private String quoteCurrency;
	private String quantityIncrement;
	private String tickSize;
	private String takeLiquidityRate;
	private String provideLiquidityRate;
	private String feeCurrency;
	// Getter Methods

	public String getId() {
		return id;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public String getQuoteCurrency() {
		return quoteCurrency;
	}

	public String getQuantityIncrement() {
		return quantityIncrement;
	}

	public String getTickSize() {
		return tickSize;
	}

	public String getTakeLiquidityRate() {
		return takeLiquidityRate;
	}

	public String getProvideLiquidityRate() {
		return provideLiquidityRate;
	}

	public String getFeeCurrency() {
		return feeCurrency;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public void setQuoteCurrency(String quoteCurrency) {
		this.quoteCurrency = quoteCurrency;
	}

	public void setQuantityIncrement(String quantityIncrement) {
		this.quantityIncrement = quantityIncrement;
	}

	public void setTickSize(String tickSize) {
		this.tickSize = tickSize;
	}

	public void setTakeLiquidityRate(String takeLiquidityRate) {
		this.takeLiquidityRate = takeLiquidityRate;
	}

	public void setProvideLiquidityRate(String provideLiquidityRate) {
		this.provideLiquidityRate = provideLiquidityRate;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}
}
