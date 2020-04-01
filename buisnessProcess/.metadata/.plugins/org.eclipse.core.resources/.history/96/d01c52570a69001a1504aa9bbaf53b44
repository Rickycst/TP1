package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LookupRiskDBTask implements JavaDelegate {
	
	private Logger LOG = LoggerFactory.getLogger(LookupRiskDBTask.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		int result = 0;
		
		LOG.info("Lookup Risk DB Task");
		
		String userFirstName= (String) execution.getVariable("First name");
		String userLastName= (String) execution.getVariable("Last name");
		String userEmail= (String) execution.getVariable("email");
		
		if (userFirstName.length() >= 10) {
			result += -20000;
		} else {
			result += 20000;
		}
		
		if (userLastName.length() >= 10) {
			result += 8000;
		} else {
			result += -8000;
		}
		
		if (userEmail.length() >= 10) {
			result += -5000;
		} else {
			result += 5000;
		}
		
		execution.setVariable("User overdraft",result);
	}

}
