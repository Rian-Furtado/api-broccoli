package com.foodfinder.app.controller;


import com.foodfinder.app.model.Food;
import com.foodfinder.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired(required = true)
    private FoodService foodService;

    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @GetMapping("region/{region}")
    public List<Food> getFoodByRegion(@PathVariable String region){
        return foodService.getFoodByRegion(region);
    }


    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }

}
