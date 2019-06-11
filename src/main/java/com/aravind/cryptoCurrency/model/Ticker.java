package com.aravind.cryptoCurrency.model;

public class Ticker {
	private String symbol;
	 private String ask;
	 private String bid;
	 private String last;
	 private String low;
	 private String high;
	 private String open;
	 private String volume;
	 private String volumeQuoute;
	 private String timestamp;


	 // Getter Methods 

	 public String getSymbol() {
	  return symbol;
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

	 public String getLow() {
	  return low;
	 }

	 public String getHigh() {
	  return high;
	 }

	 public String getOpen() {
	  return open;
	 }

	 public String getVolume() {
	  return volume;
	 }

	 public String getVolumeQuoute() {
	  return volumeQuoute;
	 }

	 public String getTimestamp() {
	  return timestamp;
	 }

	 // Setter Methods 

	 public void setSymbol(String symbol) {
	  this.symbol = symbol;
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

	 public void setLow(String low) {
	  this.low = low;
	 }

	 public void setHigh(String high) {
	  this.high = high;
	 }

	 public void setOpen(String open) {
	  this.open = open;
	 }

	 public void setVolume(String volume) {
	  this.volume = volume;
	 }

	 public void setVolumeQuoute(String volumeQuoute) {
	  this.volumeQuoute = volumeQuoute;
	 }

	 public void setTimestamp(String timestamp) {
	  this.timestamp = timestamp;
	 }
}
