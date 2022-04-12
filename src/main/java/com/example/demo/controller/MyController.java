package com.example.demo.controller;

import com.example.demo.PizzaRespository;
import com.example.demo.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    // sdfgsdgsdfgsgsdfg
    @Autowired
    PizzaRespository respository;

    @GetMapping("/")
    public String isdfgsdfg() {
        return "index"; // index.html
    }

    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name,
               @RequestParam Integer size) {
        Pizza pizza = new Pizza(name, size);
        respository.save(pizza);
        return "Saved!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Pizza> getAll() {
        return respository.findAll();
    }

}
