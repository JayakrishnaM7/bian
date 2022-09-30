package com.ibm.org.bian.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.org.bian.model.AccountRs;
import com.ibm.org.bian.service.AccountI;

@RestController
@RequestMapping("v1/bian-3/core/creditor/10.0.0/")
public class AccountController {

	@Autowired
	AccountI accountI;

	@GetMapping("/balancecheck/{accountid}")
	public List<AccountRs>  getAccountBalance(@PathParam("accountid") String accountId) {
		//TODO business logic 
		
		//return new ResponseEntity<Mono<AccountRs>>(accountI.getbalance(accountId), HttpStatus.OK);
		return accountI.getbalance(accountId);
	}

	@GetMapping("/checklimit/{accountid}")
	public List<AccountRs> checkAccountLimit(@PathParam("accountid") String accountId) {
		//TODO business logic 
		accountI.checklimit(accountId);
		return accountI.checklimit(accountId);
	}

	@GetMapping("/externalaccountrefdata/{accountid}")
	public String getExternalAccountData(@PathParam("accountid") String accountId) {
		//TODO business logic 
		accountI.getExternalDetails(accountId);
		return "hello";
	}
}
