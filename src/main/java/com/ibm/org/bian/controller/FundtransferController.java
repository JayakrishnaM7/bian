package com.ibm.org.bian.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/bian-3/core/payment/creditor/10.0.0/")
public class FundtransferController {
	@PostMapping("/initpayment")
	public String initPayment() {
		//business logic goes here
		return "hello";
	}

	@PostMapping("/initfundtransfer")
	public String initFundtransfer() {
		//business logic goes here
		return "hello";
	}

	@PostMapping("/coductamlcheck")
	public String conductAMLcheck() {
		//business logic goes here
		return "hello";
	}

	@PostMapping("/recordrequestpayment")
	public String recordPayment() {
		//business logic goes here
		return "hello";
	}

	@PostMapping("/sendpaymentmessage")
	public String sendPaymentMessage() {
		//business logic goes here
		return "hello";
	}
}
