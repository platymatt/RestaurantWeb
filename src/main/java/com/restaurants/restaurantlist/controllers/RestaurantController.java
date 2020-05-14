package com.restaurants.restaurantlist.controllers;

import com.restaurants.restaurantlist.data.Restaurant;
import com.restaurants.restaurantlist.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController{

  @Autowired
  RestaurantRepository restaurantRepository;

  @GetMapping
  Iterable<Restaurant> getAllRestaurants() {
    return restaurantRepository.findAll();
  }

}
