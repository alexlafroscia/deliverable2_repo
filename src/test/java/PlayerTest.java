package com.laboon;

import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.junit.Test;

public class PlayerTest {

	 /*
	   * Test case builds player that has all items set to false
	   * Return of hasAllItems() should be false
	   */
	  @Test
	  public void testAllItemsEmpty() { 
	    
	    //Create new Player object
	    Player tester = new Player();
	    
	    //Test Case
	    assertFalse(tester.hasAllItems());
	  }
	  
	  /*
	   * Test case builds player that has one items set to true
	   * Return of hasAllItems() should be false
	   */
	  @Test
	  public void testAllItemsLoseOne() { 
	    
	    //Create new Player object
	    Player tester = new Player(true, false, false);
	    
	    //Test Case
	    assertFalse(tester.hasAllItems());
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
	    assertFalse(tester.hasAllItems());
	  }
	  
	  /*
	   * Test case builds player that has all items
	   * Return of hasAllItems() should be true
	   */
	  @Test
	  public void testAllItems() { 
	    
	    Player tester = new Player(true, true, true);
	    
	    //Test Case
	    assertTrue(tester.hasAllItems());
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
	    assertFalse(tester.drink());
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
	    assertFalse(tester.drink());
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
	    assertFalse(tester.drink());
	  }
	  
	  /*
	   * Test case builds player that has all items
	   * Return of hasAllItems() should be true
	   */
	  @Test
	  public void testDrinkAllItems() { 
	    
	    Player tester = new Player(true, true, true);
	    
	    //Test Case
	    assertTrue(tester.drink());
	  }
	}
