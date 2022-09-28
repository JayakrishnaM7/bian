package com.ibm.org.bian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.org.bian.service.AccountI;

@RestController
@RequestMapping("v1/bian-3/core/creditor/10.0.0/")
public class AccountController {

	@Autowired
	AccountI accountI;

	@GetMapping("/balancecheck")
	public String getAccountBalance(String accountId) {
		//TODO business logic 
		accountI.getbalance(accountId);
		return "hello";
	}

	@GetMapping("/checklimit")
	public String checkAccountLimit(String accountId) {
		//TODO business logic 
		accountI.checklimit(accountId);
		return "hello";
	}

	@GetMapping("/externalaccountrefdata")
	public String getExternalAccountData() {
		//TODO business logic 
		accountI.getExternalDetails();
		return "hello";
	}
}
