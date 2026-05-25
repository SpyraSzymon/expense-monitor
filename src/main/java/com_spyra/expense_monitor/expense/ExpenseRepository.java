package com_spyra.expense_monitor.expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
