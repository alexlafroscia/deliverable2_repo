package com.laboon;

import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class HouseTest {

  @Test
  public void HouseTestsRun() {
    assertEquals(0, 0);
  }

  /*
   * This test case checks that when getCurrentRoomInfo() is called with a value of _currentRoom that is within the array size
   * the stubbed description is returned for that specific index in the array
   */
  @Test
  public void testGetCurrentRoomInfo(){

    Room[] roomArray = new Room[2]; //Create array of rooms set to size 2
    roomArray[0] = mock(Room.class); //Initialize both rooms with mock Room class
    roomArray[1] = mock(Room.class);

    //Create stub of .getDescription() method in Room class
    doReturn("Hi").when(roomArray[1]).getDescription();

    //Create House object that will set _rooms equal to roomArray and _numRooms equal to 2
    House houseTester = new House(roomArray);

    houseTester.moveNorth(); //Assure that _currentRoom is set to 1

    //Test Case
    assertEquals(houseTester.getCurrentRoomInfo(), "Hi");
  }

  /*
   * This test case is an edge case that checks that the expected output for a room
   * greater than the size of the array returns
   * "You are in a magical land! But you are returned to the beginning!"
   */
  @Test
  public void testGetCurrentRoomInfoEdgeCase(){

    Room[] roomArray = new Room[1];//Create array of rooms set to size 1

    //Create House object that sets _numRooms to 1 and _rooms to roomArray and _currentRoom to 0
    House houseTester = new House(roomArray);

    //Set _currentRoom to 1, thus outside size of roomArray
    houseTester.moveNorth();

    //Test Case
    String s = houseTester.getCurrentRoomInfo();
    assertEquals(s, "You are in a magical land!  But you are returned to the beginning!");
  }

  /*
   * This test case checks that generateRooms(_numRooms)'s return value of the room array toReturn 
   * Contains the correct boolean values for a given House size instantiation
   * Dependent upon the _numRooms and a for loop, five different boolean values are set
   * For this particular House object, the create boolean values were determined for the 0th room and 1st room
   * This values can then comprise Room objects listed below as comparison and comparison2
   * These Room objects are assured to be equal to the specific index in the toReturn array that holds Room objects
   */
  @Test
  public void testRoomGenerator(){    
    
    //Create House object that sets _numRooms to 2 and calls method generateRooms(2) returning the array value for _rooms
    House houseTester = new House(2);
                            //coffee, cream, sugar, north, south
    Room comparison = new Room(false, true, true, false, false); //For 0th room in houseTester
    Room comparison2 = new Room(false, false, true, false, true); //For 1st room in houseTester

    //Test Case
    assertEquals(houseTester.generateRooms(1)[0].hasCream(), comparison.hasCream());
    assertEquals(houseTester.generateRooms(1)[0].hasSugar(), comparison.hasSugar());
    assertEquals(houseTester.generateRooms(1)[0].hasCoffee(), comparison.hasCoffee());
    assertEquals(houseTester.generateRooms(1)[0].northExit(), comparison.northExit());
    assertEquals(houseTester.generateRooms(1)[0].southExit(), comparison.southExit());
    
    assertEquals(houseTester.generateRooms(2)[1].hasCream(), comparison2.hasCream());
    assertEquals(houseTester.generateRooms(2)[1].hasSugar(), comparison2.hasSugar());
    assertEquals(houseTester.generateRooms(2)[1].hasCoffee(), comparison2.hasCoffee());
    assertEquals(houseTester.generateRooms(2)[1].northExit(), comparison2.northExit());
    assertEquals(houseTester.generateRooms(2)[1].southExit(), comparison2.southExit());
  }
}



