package com.loans.practice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.loans.practice.entity.Loans;

public interface LoanRepository extends JpaRepository<Loans, Integer> {
	List<Loans> findByCustomerId(Integer id);
	
}
