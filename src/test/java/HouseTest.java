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
    Room mockRoom = mock(Room.class);
    mockRoom[] mockRoomArray = new mockRoom[1];//Create array of mockRooms set to size 1

    //Create stub of .getDescription() method in Room class
    mockRoom.when(mockRoom.getDescription()).thenReturn("hi");

    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(mockRoomArray);

    //Test Case
    assertEquals(houseTester.getCurrentRoomInfo(), "hi");
  }

  /*
   * This test case checks that the expected output for a room
   * greater than the size of the array returns
   * "You are in a magical land! But you are returned to the beginning!"
   */
  @Test
  public void testGetCurrentRoomInfoEdgeCase(){

    //Create mock of Room class
    Room mockRoom = mock(Room.class);
    mockRoom[] mockRoomArray = new mockRoom[1];//Create array of mockRooms set to size 1

    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(mockRoomArray);

    //Set _currentRoom to 1, thus outside size of mockRoomArray
    houseTester.moveNorth();

    //Test Case
    assertEquals(houseTester.getCurrentRoomInfo(), "You are in a magical land! But you are returned to the beginning!");
  }

  /*
   * This test case checks that toReturn room array contains the correct boolean values
   * Associated with the room's position in the house that is the first room where the cream
   * Is found and there is only a north door
   */
  @Test
  public void testRoomGenerator(){

    //Create mock of Room class
    Room mockRoom = mock(Room.class);
    mockRoom[] mockRoomArray = new mockRoom[1];//Create array of mockRooms set to size 1

    //Create House object that sets _numRooms to 1 and _rooms to mockRoomArray and _currentRoom to 0
    House houseTester = new House(mockRoomArray);

    //Test Case
    assertEquals(roomGenerated, new mockRoom[]{false, true, false, true, false});
  }
}
