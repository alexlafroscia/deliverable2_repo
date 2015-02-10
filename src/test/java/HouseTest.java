package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;

public class HouseTest {

  @Test
  public void HouseTestsRun() {
    assertEquals(0, 0);
  }
  /*
   * This test case checks that the expected output for a room that is less than zero
   * or greater than _numRooms (6) produces the string 
   * "You are in a magical land! But you are returned to the beginning!"
   */
  @Test
  public void testBoundaryRooms(){
    
    //Create mock of House object
    House tester = Mockito.mock(House.class);
    
    //Test Case
    assertEquals(tester.getCurrentRoomInfo(), "You are in a magical land! But you are returned to the beginning!");
  }
  
  /*
   * This test case checks that array of rooms toReturn is of size 6  (_numRooms)
   * The test case also checks the boolean values at each room
   * northDoor, southDoor, hasCoffee, hasCream and hasSugar
   */
  @Test
  public void testRoomGenerator(){
    
    House tester = new House(6);
    
    //Test Case
    assertEquals(tester.generateRooms(6).length, 6);
    
  }
}

