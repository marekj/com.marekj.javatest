package com.marekj.javatest;

/**
 * some example class with fields
 */
public class Beer {
  private String brewery;
  private String name;
  private Integer rating;


  /**
   *
   * @param name
   * @param brewery
   * @param rating
   */
  public Beer(String name, String brewery, Integer rating) {
    this.name = name;
    this.brewery = brewery;
    this.rating = rating;
  }

  public String getBrewery() {
    return brewery;
  }

  public String getName() {
    return name;
  }

  public Integer getRating() {
    return rating;
  }
}
