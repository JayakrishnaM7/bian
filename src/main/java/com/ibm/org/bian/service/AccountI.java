package com.ibm.org.bian.service;

import java.util.List;

import com.ibm.org.bian.model.AccountRs;

public interface AccountI {
	List<AccountRs> getbalance(String accountId);
	List<AccountRs> checklimit(String accountId);
	AccountRs getExternalDetails(String accountId);

}
