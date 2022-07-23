package com.loans.practice.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "loans")
@Setter
@Getter
public class LoansConfig {
	
	private String msg;
	private String buildVersion;
	private Map<String,String> mailDetails;
	private List<String> activeBranches;
}
