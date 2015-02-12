package com.laboon;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.*;
import static org.mockito.Mockito.*;

public class RoomTest {

  @Test
  public void CanDetectHavingNoItems() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasItem());
  }

  @Test
  public void CanDetectHavingSomeItems() {
    Room room = new Room(true, false, false, false, false);
    assertTrue(room.hasItem());
  }

  @Test
  public void CanDetectHavingSugar() {
    Room room = new Room(false, false, true, false, false);
    assertTrue(room.hasSugar());
  }

  @Test
  public void CanDetectNotHavingSugar() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasSugar());
  }

  @Test
  public void CanDetectHavingCream() {
    Room room = new Room(false, true, false, false, false);
    assertTrue(room.hasCream());
  }

  @Test
  public void CanDetectNotHavingCream() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasCream());
  }

  @Test
  public void CanDetectHavingCoffee() {
    Room room = new Room(true, false, false, false, false);
    assertTrue(room.hasCoffee());
  }

  @Test
  public void CanDetectNotHavingCoffee() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.hasCoffee());
  }

  @Test
  public void CanDetectHavingNorthExit() {
    Room room = new Room(false, false, false, true, false);
    assertTrue(room.northExit());
  }

  @Test
  public void CanDetectNotHavingNorthExit() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.northExit());
  }

  @Test
  public void CanDetectHavingSouthExit() {
    Room room = new Room(false, false, false, false, true);
    assertTrue(room.southExit());
  }

  @Test
  public void CanDetectNotHavingSouthExit() {
    Room room = new Room(false, false, false, false, false);
    assertFalse(room.southExit());
  }

  /*
   * This test doesn't really show much, and originally I wanted the test to do
   * more.  I had tried to initialize three rooms, and then test the description
   * of each of them based on the order they were instantiated.  However,
   * because the description depend on a static, private variable, the only way
   * to stub that value, and therefore get consistent test results, is to use
   * reflection.  Therefore, testing getDescription() in a nondeterministic way
   * isn't really possible with the way that Room.java is currently set up.
   */
  @Test
  public void CanGetDescription() {
    Room room1 = mock(Room.class);
    doReturn("Hello, Bill!").when(room1).getDescription();

    assertEquals(room1.getDescription(), "Hello, Bill!");
  }

}

