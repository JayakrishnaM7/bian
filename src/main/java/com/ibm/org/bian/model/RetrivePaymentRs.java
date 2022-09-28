package com.ibm.org.bian.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 0031CY744
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetrivePaymentRs {
	private String SuccessResponse;
	private String PaymentOrderProcedure;
	private String PaymentTransactionInitiatorReference;
	private String PayerReference;
	private String PayerBankReference;
	private String PayerProductInstanceReference;
	private String PayeeReference;
	private String PayeeBankReference;
	private String PayeeProductInstanceReference;
	private String Amount;
	private String Currency;
	private String DateType;
	private String PaymentMechanismType;
	private String PaymentInstructions;
	private String InterestedParties;
	private String ProductType;
	private String SettlementInstructions;

}
