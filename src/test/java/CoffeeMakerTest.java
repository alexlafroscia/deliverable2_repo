package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class CoffeeMakerTest {

  /*
   * Test to make sure that the runArgs() method returns the correct value
   */
  @Test
  public void RunArgsReturnsZero() {
    String arg = "argghhhh";
    CoffeeMaker cm = new CoffeeMaker();
    assertEquals(cm.runArgs(arg), 0);
  }

}

