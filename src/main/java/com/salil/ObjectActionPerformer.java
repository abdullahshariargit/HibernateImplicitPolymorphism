package com.salil;

import com.salil.beans.Student;

public class ObjectActionPerformer {

	public static void main(String[] args) {
		
		HibernateInterface.exectueQuery("delete from com.salil.beans.Student");
		HibernateInterface.saveEntities(new Student("Salil", "Verma"));
		//This would retrieve all the rows in database which can be accessed via hibernate 		
		System.out.println("\n\nResult of querying on Object class = "+HibernateInterface.getRecordsOfType(Object.class));
	}
}
