package com.aravind.cryptoCurrency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aravind.cryptoCurrency.model.Currencies;
import com.aravind.cryptoCurrency.model.CurrencyConversion;
import com.aravind.cryptoCurrency.service.CurrencyService;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyService currencyService;

	@GetMapping("/currency/all")
	public List<Currencies> displayAll() {
		return currencyService.displayAllCurrencies();
	}

	@GetMapping("/currency/{symbol}")
	public Currencies displaySingleCurrency(@PathVariable String symbol) {
		return currencyService.displaySingleCurrency(symbol);
	}

}