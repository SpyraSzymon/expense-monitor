package com_spyra.expense_monitor.expense;

import com_spyra.expense_monitor.category.Categoryrepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final Categoryrepository categoryRepository;

    public ExpenseService(ExpenseRepository expenseRepository, Categoryrepository categoryRepository) {
        this.expenseRepository = expenseRepository;
        this.categoryRepository = categoryRepository;
    }


    public Expense createExpense(BigDecimal amount, Long categoryId, LocalDate date){
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Expense must be greater then 0");
        }
        Expense expense = new Expense();
        expense.setAmount(amount);
        expense.setCategory(categoryRepository.findById(categoryId).orElseThrow());
        expense.setDate(date);
        return expenseRepository.save(expense);
    }
    public List <Expense> getExpense(){
        return expenseRepository.findAll();
    }

}