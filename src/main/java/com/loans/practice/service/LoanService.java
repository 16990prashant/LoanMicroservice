package com.loans.practice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.loans.practice.entity.Loans;
import com.loans.practice.repository.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanRepository;

	public List<Loans> getDetails(Integer id) {
		List<Loans> loans = loanRepository.findByCustomerId(id);				
	if (loans.size()> 0 ) {
		return loans;
	} else {
		throw new RuntimeException("Card not found with customer id : " + id);
	}
	}
}
