package com.ibm.org.bian.service;

import com.ibm.org.bian.model.InitPaymentRequest;
import com.ibm.org.bian.model.InitPaymentResponse;
import com.ibm.org.bian.model.RetrivePaymentRq;
import com.ibm.org.bian.model.RetrivePaymentRs;
import com.ibm.org.bian.model.UpdatePaymentRq;
import com.ibm.org.bian.model.UpdatePaymentRs;

public interface PaymentsapiprocessI {
	public InitPaymentResponse intpaymentProcess(InitPaymentRequest initPaymentRequest);

	public UpdatePaymentRs updatepaymentProcess(UpdatePaymentRq UpdatePaymentRq);

	public RetrivePaymentRs retrivepaymentProcess(RetrivePaymentRq RetrivePaymentRq,int paymentorderid);
}
