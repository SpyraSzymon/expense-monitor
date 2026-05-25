package com_spyra.expense_monitor.expense;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }


    public Expense createExpense(BigDecimal amount)
}