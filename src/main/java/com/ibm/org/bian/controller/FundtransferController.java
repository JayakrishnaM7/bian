package com.ibm.org.bian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.org.bian.model.InitPaymentRequest;
import com.ibm.org.bian.service.PaymentsapiprocessI;

@RestController
@RequestMapping("v1/bian-3/core/payment/creditor/10.0.0/")
public class FundtransferController {
	@Autowired
	PaymentsapiprocessI paymentsapiprocessI;
	

	@PostMapping("/initpayment")
	public String initPayment(@RequestBody InitPaymentRequest initPaymentRequest) {
		//TODO business logic 
		paymentsapiprocessI.intpaymentProcess(initPaymentRequest);
		return "hello";
	}

	@PostMapping("/initfundtransfer")
	public String initFundtransfer() {
		//TODO business logic 
		return "hello";
	}

	@PostMapping("/coductamlcheck")
	public String conductAMLcheck() {
		//TODO business logic 
		return "hello";
	}

	@PostMapping("/recordrequestpayment")
	public String recordPayment() {
		//TODO business logic 
		return "hello";
	}

	@PostMapping("/sendpaymentmessage")
	public String sendPaymentMessage() {
		//TODO business logic 
		return "hello";
	}
}
