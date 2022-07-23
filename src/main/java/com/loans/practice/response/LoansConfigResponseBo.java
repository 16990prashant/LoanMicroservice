package com.loans.practice.response;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoansConfigResponseBo {

	private String msg;
	private String buildVersion;
	private Map<String,String> mailDetails;
	private List<String> activeBranches;
}
