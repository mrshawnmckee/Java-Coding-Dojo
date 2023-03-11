package com.dojo.expense.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.expense.models.Expense;
import com.dojo.expense.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepo;
	
	public List<Expense> allExepenses() {
		return expenseRepo.findAll();
	}
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepo.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense editExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	public void deleteExpense(Expense expense) {
		expenseRepo.delete(expense);
	}

}
