package com.marekj.javatest;

/*
 * Anatomy of assertj style you get assertThat static method and all fluent methods
 */
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class AboutListTest {

  /*
   * type needed only on the left, only diamond operator on the right no need to repeat what's on
   * the left
   */
  List<String> list = new ArrayList<>();
  /*
   * alternative declere list to be a concrete Type and not an interface but it's not advisable
   * ArrayList<String> list = new ArrayList<>();
   */

  @Before
  public void setup() {
    // should be empty when new
    assertThat(list).isEmpty();
    // alternative size is zero
    // assertThat(list.size()).isZero();
  }

  @Test
  public void addingAndRemovingElements() {

    // add item
    Boolean b = list.add("foo");
    assertThat(b).isTrue();

    list.add("bar");
    list.add("baz");
    assertThat(list.size()).isEqualTo(3);

    // alternative
    assertThat(list).hasSize(3);


    // another list and addAll items from list
    ArrayList<String> anotherList = new ArrayList<>();
    anotherList.addAll(list);

    // TODO alternative is to use Arrays.asList(); but we need String[] and not ArrayList<String>

    assertThat(list).isEqualTo(anotherList);
    assertThat(list.size()).isEqualTo(3);

    // remove something
    String first = list.remove(0);
    assertThat(first).isEqualTo("foo");
    assertThat(list).hasSize(2);

    assertThat(list).contains("bar", "baz").doesNotContain("foo");

    anotherList.removeAll(list);
    assertThat(anotherList.isEmpty());

  }


}
