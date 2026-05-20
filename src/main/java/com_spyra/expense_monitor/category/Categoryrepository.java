package com_spyra.expense_monitor.category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoryrepository extends JpaRepository <Category, Long>  {
    boolean existsByNameIgnoreCase(String name);
}
