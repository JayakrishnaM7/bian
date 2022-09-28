package com.ibm.org.bian.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/bian-3/core/payment/creditor/10.0.0/")
public class FundtransferController {
	@PostMapping("initpayment")
	public String getStudent() {
		return "hello";
	}
}
