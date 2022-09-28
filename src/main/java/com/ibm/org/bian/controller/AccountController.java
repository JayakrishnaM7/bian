package com.ibm.org.bian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/bian-3/core/creditor/10.0.0/")
public class AccountController {
	@GetMapping("/balancecheck")
	public String getAccountBalance() {
		return "hello";
	}

	@GetMapping("/checklimit")
	public String checkAccountLimit() {
		return "hello";
	}

	@GetMapping("/externalaccountrefdata")
	public String getExternalAccountData() {
		return "hello";
	}
}
