package com.foodfinder.app.service;


import com.foodfinder.app.model.Food;
import com.foodfinder.app.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired(required = true)
    private FoodRepository foodRepository;

    public List<Food> getAllFoods() {
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    public List<Food> getFoodByRegion(String region){
        return foodRepository.findByRegion(region);
    }

    public Food saveFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
}
