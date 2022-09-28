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
public class InitPaymentResponse {
	
	private String SuccessResponse;
	private String PaymentOrderProcedure;
	private String PaymentMechanismType;

}
