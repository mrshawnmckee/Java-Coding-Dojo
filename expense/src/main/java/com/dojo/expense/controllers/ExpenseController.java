package com.dojo.expense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.expense.models.Expense;
import com.dojo.expense.services.ExpenseService;

@Controller

public class ExpenseController {
	
	@Autowired
	ExpenseService expenseServ;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	

	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseServ.allExepenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	

	@PostMapping("/expenses")
	//@valid runs the validator on the model, BindingResult is the dependency Injector
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseServ.allExepenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";			
		} else {
			expenseServ.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseServ.findExpense(id));
		return "edit.jsp";
		}
	
	
	@GetMapping("/expenses/{id}")
	public String itemExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", expenseServ.findExpense(id));
		return "item.jsp";
	}
	
	@GetMapping("/expenses/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id ) {
		Expense expense = expenseServ.findExpense(id);
		expenseServ.deleteExpense(expense);
		return "redirect:/expenses";
	}
}
