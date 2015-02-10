package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {
  
  @Test
  public void PlayerTestsRun() {
    assertEquals(0, 0);
  }
  
  /*
   * Test case builds player that has all items set to false
   * Return of hasAllItems() should be false
   */
  @Test
  public void testAllItemsEmpty() { 
    
    //Create mock of Player object
    Player tester = new Player();
    
    //Test Case
    assertEquals(tester.hasAllItems(),false);
  }
  
  /*
   * Test case builds player that has one items set to true
   * Return of hasAllItems() should be false
   */
  @Test
  public void testAllItemsLoseOne() { 
    
    //Create mock of Player object
    Player tester = new Player(true, false, false);
    
    //Test Case
    assertEquals(tester.hasAllItems(),false);
  }
  
    
  /*
   * Test case builds player that has two items set to true
   * Return of hasAllItems() should be false
   */
  @Test
  public void testAllItemsLoseTwo() { 
    
    //Create mock of Player object
    Player tester = new Player(true, true, false);
    
    //Test Case
    assertEquals(tester.hasAllItems(),false);
  }
  
  /*
   * Test case builds player that has all items
   * Return of hasAllItems() should be true
   */
  @Test
  public void testAllItems() { 
    
    Player tester = new Player(true, true, true);
    
    //Test Case
    assertEquals(tester.hasAllItems(),true);
  }
  
  /*
   * Test case builds player that has no items
   * Return of drink() should be false
   */
  @Test
  public void testDrinkEmpty() { 
    
    //Create Player object
    Player tester = new Player();
    
    //Test Case
    assertEquals(tester.drink(),false);
  }
  
  /*
   * Test case builds player that has one item
   * Return of drink() should be false
   */
  @Test
  public void testDrinkLoseOne() { 
    
    //Create Player object
    Player tester = new Player(true, false, false);
    
    //Test Case
    assertEquals(tester.drink(),false);
  }
  
  /*
   * Test case builds player that has two items
   * Return of drink() should be false
   */
  @Test
  public void testDrinkLoseTwo() { 
    
    //Create Player object
    Player tester = new Player(true, true, false);
    
    //Test Case
    assertEquals(tester.drink(),false);
  }
  
  /*
   * Test case builds player that has all items
   * Return of hasAllItems() should be true
   */
  @Test
  public void testDrinkAllItems() { 
    
    Player tester = new Player(true, true, true);
    
    //Test Case
    assertEquals(tester.drink(),true);
  }
}
