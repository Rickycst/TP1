package com.example.buisnessProcess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculateRiskScoreTask implements JavaDelegate{

	private Logger LOG = LoggerFactory.getLogger(CalculateRiskScoreTask.class);
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOG.info("Calcule du score de risque"); 
		
		int userOverdraft= (int) execution.getVariable("User overdraft");
		int userCreditAmount= (int) execution.getVariable("Credit amount");
		int userCreditDuration= (int) execution.getVariable("Credit duration");
		
		//TODO : implements rules
		
		execution.setVariable("approved", false);
		execution.setVariable("approved", true);
		execution.setVariable("denied", true);
		execution.setVariable("denied", false);

		
	}

}
