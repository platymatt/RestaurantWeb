package com.restaurants.restaurantlist.repositories;

import com.restaurants.restaurantlist.data.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
}
