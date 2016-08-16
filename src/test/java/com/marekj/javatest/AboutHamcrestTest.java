package com.marekj.javatest;

import org.junit.Test;
/*
 * hamcrest matchers inclued in junit as dependency
 * compare to assertj
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;


public class AboutHamcrestTest {

  @Test
  public void equality(){
    assertThat("a", is("a"));
    assertThat('a', equalTo('a'));
    assertThat('b', is(equalTo('b')));
  }
}
