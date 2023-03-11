package com.dojo.expense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.expense.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
	public List<Expense> findAll();
	
}
