package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class GameTest {

	  @Test
	  public void GameTestsRun() {
	    assertEquals(0, 0);
	  }
	
  /*
   * Test case creates mock of Player class and House class in order to create Game object
   * When the string is entered into doSomething(), the result should be the same
   * for either lower or upper case values of that string. doSomething() returns the int toReturn
   * This int is only updated through arguments "D" and "d" in which case for this test, should return -1
   * For all other strings, the return value should be 0
   */
  @Test
  public void testCaseInsensitiveCommands(){

  //Create mock of player and house
  Player mockPlayer = mock(Player.class);
  House mockHouse = mock(House.class);
  //Create Game object
  Game gameTester = new Game(mockPlayer, mockHouse);

  //Test Cases
  assertEquals(gameTester.doSomething("n"), gameTester.doSomething("N"));
  assertEquals(gameTester.doSomething("s"), gameTester.doSomething("S"));
  assertEquals(gameTester.doSomething("l"), gameTester.doSomething("L"));
  assertEquals(gameTester.doSomething("i"), gameTester.doSomething("I"));
  assertEquals(gameTester.doSomething("d"), gameTester.doSomething("D"));
  assertEquals(gameTester.doSomething("h"), gameTester.doSomething("H"));
 }

  /*
   * When the string "n" or "N" is entered into doSomething()
   * There should be a call to moveNorth() which is located within an if statement that tests the argument values
   * moveNorth() is a method found in the House class
   * Through mockito verification, this method should be accounted for twice
   * SHOULD FAIL DUE TO "n" NOT BEING RECOGNIZED
   */
  @Test
   public void testMovementNorth(){

     //Create mock of player and house
     Player mockPlayer = mock(Player.class);
     House mockHouse = mock(House.class);
     //Create Game object
     Game gameTester = new Game(mockPlayer, mockHouse);

     //Test Cases
     gameTester.doSomething("n");
     gameTester.doSomething("N");
     verify(mockHouse, times(2)).moveNorth(); //Check if moveNorth() is called twice
   }

   /*
    * When the string "s" or "S" is entered into doSomething()
    * There should be a call to moveSouth(), a House class method
    * Through mockito verification, this method should be accounted for twice
    */
   @Test
   public void testMovementSouth(){

     //Create mock of player and house
     Player mockPlayer = mock(Player.class);
     House mockHouse = mock(House.class);
     //Create Game object
     Game gameTester = new Game(mockPlayer, mockHouse);

     when(mockHouse.moveSouth()).thenReturn(true);

     //Test Cases
     gameTester.doSomething("s");
     gameTester.doSomething("S");
     verify(mockHouse, times(2)).moveSouth(); //Check if moveSouth() is called twice
   }

   /*
    * When the string "l" or "L" is entered into doSomething()
    * There should be a call to look(player object, null) a House class method
    * Through mockito verification, this method should be accounted for twice
    */
   @Test
   public void testLook(){

     //Create mock of player and house
     Player mockPlayer = mock(Player.class);
     House mockHouse = mock(House.class);
     //Create Game object
     Game gameTester = new Game(mockPlayer, mockHouse);

     //Test Cases
     gameTester.doSomething("l");
     gameTester.doSomething("L");
     verify(mockHouse, times(2)).look(mockPlayer, null); //Check if look(player, null) is called twice
   }

   /*
    * When the string "i" or "I" is entered into doSomething()
    * There should be a call to showInventory() a Player class method
    * Through mockito verification, this method should be accounted for twice
    */
   @Test
   public void testShowInventory(){

     //Create mock of player and house
     Player mockPlayer = mock(Player.class);
     House mockHouse = mock(House.class);
     //Create Game object
     Game gameTester = new Game(mockPlayer, mockHouse);

     //Test Cases
     gameTester.doSomething("i");
     gameTester.doSomething("I");
     verify(mockPlayer, times(2)).showInventory(); //Check if showInventory() is called twice
   }

   /*
    * When the string "d" or "D" is entered into doSomething()
    * There should be a call to drink() which is stubbed to return true
    * Therefore boolean finalStatus will be true and toReturn will be set to 1
    */
   @Test
   public void testDrink(){

     //Create mock of player and house
     Player mockPlayer = mock(Player.class);
     House mockHouse = mock(House.class);
     //Create Game object
     Game gameTester = new Game(mockPlayer, mockHouse);

     //Create stub of .drink() method in Player class
     when(mockPlayer.drink()).thenReturn(true);

     //Test Cases
     assertEquals(gameTester.doSomething("d"), 1);
     assertEquals(gameTester.doSomething("D"), 1);
   }
}

