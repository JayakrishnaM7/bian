package com.ibm.org.bian.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ibm.org.bian.model.AccountRs;
import com.ibm.org.bian.service.AccountI;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import reactor.core.publisher.Mono;

public class AccountImpl implements AccountI {

	@Override
	@CircuitBreaker(name = "getbalance", fallbackMethod = "getbalanceFallback")
	public List<AccountRs> getbalance(String accountId) {
		// TODO Auto-generated method stub
		// Mono<AccountRs> response=Mono.just(new AccountRs());
		AccountRs response = new AccountRs();
		response.setAccountAvailableBalance("1023445");
		response.setAccountCurrency("RS");
		response.setAccountNumber("320191919191919");
		response.setAccountType("SAVINGS");
		response.setDateType(new Date().toString());
		response.setTaxReference("Yes");
		List<AccountRs> list = new ArrayList<AccountRs>();
		list.add(response);

		return list;
	}
	
	public Mono<String> getbalanceFallback(Throwable ex) {
		return Mono.just("Paymentsapiprocess  is down ");
	}

	@Override
	public List<AccountRs> checklimit(String accountId) {
		// TODO Auto-generated method stub
		AccountRs response = new AccountRs();
		response.setAccountAvailableBalance("1023445");
		response.setAccountCurrency("RS");
		response.setAccountNumber("320191919191919");
		response.setAccountType("SAVINGS");
		response.setDateType(new Date().toString());
		response.setTaxReference("Yes");
		List<AccountRs> list = new ArrayList<AccountRs>();
		list.add(response);

		return list;
	}

	@Override
	public AccountRs getExternalDetails(String accountId) {
		AccountRs response = new AccountRs();
		response.setAccountAvailableBalance("1023445");
		response.setAccountCurrency("RS");
		response.setAccountNumber("320191919191919");
		response.setAccountType("SAVINGS");
		response.setDateType(new Date().toString());
		response.setTaxReference("Yes");
		return response;
	}

}
