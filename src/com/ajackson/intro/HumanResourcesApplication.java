package com.ajackson.intro;

import java.util.logging.Logger;

public class HumanResourcesApplication {
	private static final Logger log = Logger.getLogger(HumanResourcesApplication.class.getName());

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("J Smith");
		e.setEmployeeNumber("0001");
		e.setTaxpayerIdentificationNumber("123-45-6789");
		e.setSalary(java.math.BigDecimal.valueOf(45000.0));
		e.printAudit(log);		  
	}
	
}
