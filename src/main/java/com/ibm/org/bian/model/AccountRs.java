package com.ibm.org.bian.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRs {
	private String ProductInstanceReference;
	private String AccountNumber;
	private String CustomerReference;
	private String BankBranchOrLocationReference;
	private String AccountType;
	private String AccountCurrency;
	private String TaxReference;
	private String EntitlementOptionDefinition;
	private String EntitlementOptionSetting;
	private String RestrictionOptionDefinition;
	private String RestrictionOptionSetting;
	private String Associations;
	private String AssociationType;
	private String AssociationObligationOrEntitlement;
	private String AssociationReference;
	private String LinkedAccounts;
	private String LinkType;
	private String AccountDetails;
	private String AccountAvailableBalance;
	private String AccountEffectiveAvailableBalance;
	private String PositionLimits;
	private String PositionLimitType;
	private String PositionLimitSettings;
	private String PositionLimitValue;
	private String DateType;
	private String StatementsSchedule;
	private String StatementType;
	private String StatementTransactionType;
	private String StatementPeriod;
	private String StatementReport;
	private String Optional1;
	private String Optional2;
	private String Optional3;
	private String Optional4;
	private String Optional5;
;
}
