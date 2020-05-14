package com.restaurants.restaurantlist.data;

import javax.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

  @Id
  private int ranking;
  private String name;

  @JoinColumn(name="cuisine_id")
  @OneToOne(cascade = CascadeType.ALL)
  private Cuisine cuisine;

  public Restaurant() {}

  public Restaurant(int ranking, String name, Cuisine cuisine) {
    this.ranking = ranking;
    this.name = name;
    this.cuisine = cuisine;
  }

  public int getRanking() {
    return ranking;
  }

  public void setRanking(int ranking) {
    this.ranking = ranking;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cuisine getCuisine() {
    return cuisine;
  }

  public void setCuisine(Cuisine cuisine) {
    this.cuisine = cuisine;
  }

}

