package org.hov.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.hov.model.Payment;
import org.hov.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService
{
	@Autowired
	PaymentService paymentService;
	
	@Override
	public UUID createPaymentTransaction(Payment payment) 
	{
		return paymentService.createPaymentTransaction(payment);
	}

	@Override
	public Payment getPaymentTransactionById(UUID paymentId) 
	{
		return paymentService.getPaymentTransactionById(paymentId);
	}

	@Override
	public List<Payment> getPayementTransactionByOrderId(UUID orderId) 
	{
		return paymentService.getPayementTransactionByOrderId(orderId);
	}

	@Override
	public long getPaymentTransactionExpirySeconds(UUID paymentId) 
	{
		return paymentService.getPaymentTransactionExpirySeconds(paymentId);
	}
}