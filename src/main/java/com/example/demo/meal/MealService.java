package com.example.demo.meal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MealService {
    @GetMapping
    public List<Meal> getMeals() {
        return List.of(new Meal());
    }
}
