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
   * This test case checks that when getCurrentRoomInfo() is called
   * a description is returned for a valid _currentRoom that is found
   * within the array
   */
  @Test
  public void testGetCurrentRoomInfo(){

    //Create mock of Room class
    Room[] roomArray = new Room[2];//Create array of rooms set to size 1
    roomArray[0] = mock(Room.class);
    roomArray[1] = mock(Room.class);

    //Create stub of .getDescription() method in Room class
    doReturn("Hi").when(roomArray[1]).getDescription();

    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(roomArray);

    houseTester.moveNorth();

    //Test Case
    assertEquals(houseTester.getCurrentRoomInfo(), "Hi");
  }

  /*
   * This test case checks that the expected output for a room
   * greater than the size of the array returns
   * "You are in a magical land! But you are returned to the beginning!"
   */
  @Test
  public void testGetCurrentRoomInfoEdgeCase(){

    //Create array of Room object
    Room[] roomArray = new Room[1];//Create array of rooms set to size 1

    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(roomArray);

    //Set _currentRoom to 1, thus outside size of mockRoomArray
    houseTester.moveNorth();

    //Test Case
    String s = houseTester.getCurrentRoomInfo();
    assertEquals(s, "You are in a magical land!  But you are returned to the beginning!");
  }

  /*
   * This test case checks that toReturn room array contains the correct boolean values
   * Associated with the room's position in the house that is the first room where the cream
   * Is found and there is only a north door
   */
  @Test
  public void testRoomGenerator(){    
    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(2);
                            //coffee, cream, sugar, north, south
    Room comparison = new Room(false, true, true, false, false); //For 0th room
    Room comparison2 = new Room(false, false, true, false, true); //For 1st room

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



