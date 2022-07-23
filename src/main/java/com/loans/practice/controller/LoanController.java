package com.loans.practice.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loans.practice.config.LoansConfig;
import com.loans.practice.entity.Customer;
import com.loans.practice.entity.Loans;
import com.loans.practice.response.LoansConfigResponseBo;
import com.loans.practice.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;
	
	@Autowired
	private LoansConfig loansConfig;
	
	@PostMapping("/myLoans")	
	public List<Loans> getLoanDetails(@RequestBody Customer theCustomer) {		
		return loanService.getDetails(theCustomer.getCustomerId());
	}

	@GetMapping("/loans/properties")
	public LoansConfigResponseBo getAllLoansConfigProperties() {
		LoansConfigResponseBo loansConfigResponse = new LoansConfigResponseBo();
		BeanUtils.copyProperties(loansConfig, loansConfigResponse);
		return loansConfigResponse;		
	}
}