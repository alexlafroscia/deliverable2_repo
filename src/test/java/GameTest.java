package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

  @Test
  public void GameTestsRun() {
    assertEquals(0, 0);
  }

  /*
   * When the string is entered into doSomething(), the result should be the same
   * for either lower or upper case of that string
   */
  @Test
  public void caseInsensitiveCommands(){
 
  //Create mock of Game object
  Game tester = Mockito.mock(Game.class);
  
  //Test Cases
  assertEquals(tester.doSomething("n"), tester.doSomething("N"));
  assertEquals(tester.doSomething("s"), tester.doSomething("S"));
  assertEquals(tester.doSomething("l"), tester.doSomething("L"));
  assertEquals(tester.doSomething("i"), tester.doSomething("I"));
  assertEquals(tester.doSomething("d"), tester.doSomething("D"));
  assertEquals(tester.doSomething("h"), tester.doSomething("H"));
 }
   
  /*
   * When the string "n" or "N" is entered into doSomething(), a call to 
   * moveNorth() should be made to increment _currentRoom by one
   */
  @Test
   public void testMovementNorth(){
     
     //Create double of _currentRoom variable
     int _currentRoom = 0;
     
     //Create mock of Game object
     Game tester = Mockito.mock(Game.class);
     
     //Test Cases
     assertEquals(tester.doSomething("n"), _currentRoom++);
     assertEquals(tester.doSomething("N"), _currentRoom++); 
   }
   
   /*
    * When the string "s" or "S" is entered into doSomething(), a call to 
    * moveSouth() should be made to decrement _currentRoom by one
    */
   @Test
   public void testMovementSouth(){
     //Create double of _currentRoom variable
     int _currentRoom = 1;

     //Create mock of Game object
     Game tester = Mockito.mock(Game.class);
     
     //Test Cases
     assertEquals(tester.doSomething("s"), _currentRoom--);
     assertEquals(tester.doSomething("S"), _currentRoom--); 
     
   }
}

