package com.salil.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class CardPayment implements Payment {
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")

	private Long paymentId;
	private Long paymentAmount;
	private String paymentCurrency;
	private String payingAccountNumber;
	private String transferringBankName;
	
	public CardPayment() {
	}

	public CardPayment(final Long paymentAmount, final String paymentCurrency, final String payingAccountNumber,final String transferringBankName)
	{
		this.paymentAmount = paymentAmount;
		this.paymentCurrency = paymentCurrency;
		this.payingAccountNumber = payingAccountNumber;
		this.transferringBankName= transferringBankName;
	}
	
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	
	public Long getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public String getPaymentCurrency() {
		return paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}
	
	public String getPayingAccountNumber() {
		return payingAccountNumber;
	}
	public void setPayingAccountNumber(String payingAccountNumber) {
		this.payingAccountNumber = payingAccountNumber;
	
	}
	public String getTransferringBankName() {
		return transferringBankName;
	}
	public void setTransferringBankName(String transferringBankName) {
		this.transferringBankName = transferringBankName;
	}
	
	@Override
	public String toString() {
		ToStringBuilder toStringBuilder = new ToStringBuilder(this,
				ToStringStyle.DEFAULT_STYLE);
		toStringBuilder.append("paymentId",paymentId);
		toStringBuilder.append("paymentAmount",paymentAmount);
		toStringBuilder.append("paymentCurrency",paymentCurrency);
		toStringBuilder.append("payingAccountNumber",payingAccountNumber);
		toStringBuilder.append("transferringBankName",transferringBankName);
		return toStringBuilder.toString();
	}

}
