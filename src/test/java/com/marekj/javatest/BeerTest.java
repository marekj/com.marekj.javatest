package com.marekj.javatest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class BeerTest {

  @Test
  public void constructBeer() {
    Beer beer = new Beer("Hap Slappy", "RedHorn", 5);

    // gratuitous checkers
    assertThat(beer.getName()).isEqualTo("Hap Slappy");
    assertThat(beer.getBrewery()).isEqualTo("RedHorn");
    assertThat(beer.getRating()).isEqualTo(5);
  }

  @Test
  public void streamFilter(){

    // need a list to turn it into stream so we can filter collection
    // by attribute of element in that collection
    List<Beer> beers = new ArrayList<>();

    // populate list with some objects
    beers.add(new Beer("Hap Slappy", "RedHorn", 5));
    beers.add(new Beer("Heffe", "RedHorn", 2));
    beers.add(new Beer("Fireman", "Blanco", 3));

    //yes, we have 3
    assertThat(beers.size()).isEqualTo(3);

    //convert list to stream of beer objects
    Stream<Beer> stream = beers.stream();

    // filter by Predicate brewery name, get Stream back from filter operation
    stream = stream.filter(e -> "RedHorn".equals(e.getBrewery()));

    // reassign the new collection to original reference
    beers = stream.collect(Collectors.toList());
    assertThat(beers.size()).isEqualTo(2);

  }
}