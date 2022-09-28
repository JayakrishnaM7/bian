package com.ibm.org.bian.service;

import com.ibm.org.bian.model.AccountRs;

public interface AccountI {
	int getbalance(String accountId);
	int checklimit(String accountId);
	AccountRs getExternalDetails();

}
