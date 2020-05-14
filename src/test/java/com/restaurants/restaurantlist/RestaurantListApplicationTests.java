package com.restaurants.restaurantlist;

import com.restaurants.restaurantlist.repositories.RestaurantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestaurantListApplicationTests {

  @Autowired
  RestaurantRepository restaurantRepository;

	@Test
	void retrieveRestaurants() {
	  // TODO: The actual count is 10, change this value to pass the unit test
	  assertEquals( restaurantRepository.count(), 10 );
	}




}
