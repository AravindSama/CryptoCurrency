package com.aravind.cryptoCurrency.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aravind.cryptoCurrency.model.Currencies;
import com.aravind.cryptoCurrency.model.CurrencyConversion;
import com.aravind.cryptoCurrency.model.Symbol;
import com.aravind.cryptoCurrency.model.Ticker;

@Service
public class CurrencyService {
	private CurrencyConversion currencyConversion = null;
	private Currencies currency;
	private Ticker ticker = new Ticker();
	private Symbol currencySymbol = new Symbol();

	public List<Currencies> displayAllCurrencies() {
		List<String> symbols = new ArrayList<String>();
		List<Currencies> currencies = new ArrayList<Currencies>();
		symbols.add("ETHBTC");
		symbols.add("BTCUSD");
		for (String symbol : symbols) {
			currency = new Currencies();
			currency = findCurrencyInfo(symbol);
			currencies.add(currency);
		}
		return currencies;
	}

	public Currencies displaySingleCurrency(String symbol) {
		currency = new Currencies();
		currency = findCurrencyInfo(symbol);
		return currency;
	}
	
	public Currencies findCurrencyInfo(String symbol) {
		currencySymbol = new RestTemplate().getForObject("https://api.hitbtc.com/api/2/public/symbol/" + symbol,
				Symbol.class);
		currencyConversion = new RestTemplate().getForObject(
				"https://api.hitbtc.com/api/2/public/currency/" + symbol.substring(0, 3), CurrencyConversion.class);
		ticker = new RestTemplate().getForObject("https://api.hitbtc.com/api/2/public/ticker/" + symbol,
				Ticker.class);
		currency.setId(currencySymbol.getBaseCurrency());
		currency.setFullName(currencyConversion.getFullName());
		currency.setAsk(ticker.getAsk());
		currency.setBid(ticker.getBid());
		currency.setLast(ticker.getLast());
		currency.setOpen(ticker.getOpen());
		currency.setLow(ticker.getLow());
		currency.setHigh(ticker.getHigh());
		currency.setFeeCurrency(currencySymbol.getFeeCurrency());
		return currency;
	}
	

	
	

}
