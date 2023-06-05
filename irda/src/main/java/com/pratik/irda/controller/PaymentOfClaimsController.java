package com.pratik.irda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pratik.irda.entities.PaymentOfClaims;
import com.pratik.irda.service.PaymentOfClaimsService;

@RestController
public class PaymentOfClaimsController {

	@Autowired
	PaymentOfClaimsService paymentOfClaimsService;

	@GetMapping("irda/paymentStatus/report/{month}/{year}")
	PaymentOfClaims getPaymentsOfClaims(@PathVariable String month,@PathVariable int year)
	{
		return paymentOfClaimsService.getPaymentOfClaims(month,year);
	}

}
