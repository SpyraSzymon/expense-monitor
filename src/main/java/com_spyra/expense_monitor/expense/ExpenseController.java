package com_spyra.expense_monitor.expense;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {


        private final ExpenseService expenseService;

        public ExpenseController(ExpenseService expenseService) {
            this.expenseService = expenseService;
        }



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense createExpense(@RequestBody ExpenseRequest request) {
        if (request == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Request body is required");

        return expenseService.createExpense(request.amount());
    }
    @GetMapping
    public List<Expense> getExpense() {
        return expenseService.getExpense();
    }
}
