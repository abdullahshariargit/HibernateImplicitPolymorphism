package com.salil.beans;

public interface Payment {
	Long getPaymentAmount();
	void setPaymentAmount(final Long paymentAmount);
	String getPaymentCurrency();
	void setPaymentCurrency(final String currency);
}
