package com.ibm.org.bian.serviceImpl;

import org.springframework.stereotype.Service;

import com.ibm.org.bian.model.InitPaymentRequest;
import com.ibm.org.bian.model.InitPaymentResponse;
import com.ibm.org.bian.model.RetrivePaymentRq;
import com.ibm.org.bian.model.RetrivePaymentRs;
import com.ibm.org.bian.model.UpdatePaymentRq;
import com.ibm.org.bian.model.UpdatePaymentRs;
import com.ibm.org.bian.service.PaymentsapiprocessI;
@Service
public class PaymentsapiprocessImpl implements PaymentsapiprocessI {

	@Override
	public InitPaymentResponse intpaymentProcess(InitPaymentRequest initPaymentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdatePaymentRs updatepaymentProcess(UpdatePaymentRq UpdatePaymentRq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetrivePaymentRs retrivepaymentProcess(RetrivePaymentRq RetrivePaymentRq, int paymentorderid) {
		// TODO Auto-generated method stub
		return null;
	}

}
