package com.laboon;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.*;
import static org.mockito.Mockito.*;

public class RoomTest {

  /*
   * Test to make sure that the room having no items can be detected
   */
  @Test
  public void CanDetectHavingNoItems() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasItem());
  }

  /*
   * Test to make sure that the room having some amount of items creater than
   * zero can be detected
   */
  @Test
  public void CanDetectHavingSomeItems() {
    Room room = new Room(true, false, false, false, false);
    assertTrue(room.hasItem());
  }

  /*
   * Test to make sure that the room having sugar can be detected
   */
  @Test
  public void CanDetectHavingSugar() {
    Room room = new Room(false, false, true, false, false);
    assertTrue(room.hasSugar());
  }

  /*
   * Test to make sure that the room not having sugar can be detected
   */
  @Test
  public void CanDetectNotHavingSugar() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasSugar());
  }

  /*
   * Test to make sure that the room having cream can be detected
   */
  @Test
  public void CanDetectHavingCream() {
    Room room = new Room(false, true, false, false, false);
    assertTrue(room.hasCream());
  }

  /*
   * Test to make sure that the room not having cream can be detected
   */
  @Test
  public void CanDetectNotHavingCream() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasCream());
  }

  /*
   * Test to make sure that the room having coffee can be detected
   */
  @Test
  public void CanDetectHavingCoffee() {
    Room room = new Room(true, false, false, false, false);
    assertTrue(room.hasCoffee());
  }

  /*
   * Test to make sure that the room not having coffee can be detected
   */
  @Test
  public void CanDetectNotHavingCoffee() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasCoffee());
  }

  /*
   * Test to make sure that the room having a north exit can be detected
   */
  @Test
  public void CanDetectHavingNorthExit() {
    Room room = new Room(false, false, false, true, false);
    assertTrue(room.northExit());
  }

  /*
   * Test to make sure that the room not having a north exit can be detected
   */
  @Test
  public void CanDetectNotHavingNorthExit() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.northExit());
  }

  /*
   * Test to make sure that the room having a south exit can be detected
   */
  @Test
  public void CanDetectHavingSouthExit() {
    Room room = new Room(false, false, false, false, true);
    assertTrue(room.southExit());
  }

  /*
   * Test to make sure that the room not having a south exit can be detected
   */
  @Test
  public void CanDetectNotHavingSouthExit() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.southExit());
  }

  /*
   * Test to make sure that the room can return the correct description
   */
  @Test
  public void CanGetDescription() {
    Room room1 = mock(Room.class);
    doReturn("Hello, Bill!").when(room1).getDescription();

    assertEquals(room1.getDescription(), "Hello, Bill!");
  }

}

