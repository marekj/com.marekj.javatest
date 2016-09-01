package com.marekj.javatest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

  @Test
  public void aboutClassOfObject(){
    Car car = new Car();

    assertThat(car).isInstanceOf(Car.class);
    assertThat(car.getClass().getName()).isEqualTo("com.marekj.javatest.Car");
    assertThat(car.hashCode()).isInstanceOf(Integer.class);

  }
}