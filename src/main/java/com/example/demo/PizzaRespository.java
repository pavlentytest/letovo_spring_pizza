package com.example.demo;

import com.example.demo.model.Pizza;
import org.springframework.data.repository.CrudRepository;

// CRUD - Create Read Update Delete

public interface PizzaRespository extends CrudRepository<Pizza, Integer> {
}
