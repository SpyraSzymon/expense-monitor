package com_spyra.expense_monitor.expense;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseRequest(BigDecimal amount, Long category_id, LocalDate date ) {
}
