package com.sqli.shared;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sqli.service.CustomerService;

@Component
public class CustomerPurgeScheduler {
	@Autowired
	private CustomerService customerService;

	@Scheduled(cron = "0 0 0 * * ?") // Exécute la méthode tous les jours à minuit (00:00 AM)
	public void purgeCustomersWithNullStatus() {
		customerService.purgeCustomersWithNullStatus();
	}
}
