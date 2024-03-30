package com.in28minutes.microservices.currencyconversionservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyConversion {

	private Long id;

	private String from;

	private String to;

	private BigDecimal quantity;
	
	private BigDecimal conversionMultiple;

	private BigDecimal totalCalculatedAmount;

	private String envirnoment;

}
