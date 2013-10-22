package com.salil;

import com.salil.beans.CardPayment;
import com.salil.beans.CashPayment;
import com.salil.beans.Payment;

public class PaymentActoinPerfomer {

	public static void main(String[] args) {

		HibernateInterface.exectueQuery("delete from com.salil.beans.CardPayment");
		HibernateInterface.exectueQuery("delete from com.salil.beans.CashPayment");
		
		HibernateInterface.saveEntities(new CardPayment(600L, "IND", "123456789", "Salil Verma"));
		HibernateInterface.saveEntities(new CashPayment(200L, "USD", "Salil Verma"));
		
		// Attempt to retrieve all the payments (cash and card both) existing in the system	
		System.out.println("\n\nList of Payments = "+HibernateInterface.getRecordsOfType(Payment.class));
	}
	
}
