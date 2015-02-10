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

  @Test
  public void CanGetDescriptionBasedOnRoomNumber() {
    Room room1 = new Room(false, false, false, false, false);
    Room room2 = new Room(false, false, false, false, false);
    Room room3 = new Room(false, false, false, false, false);

    assertThat(room1.getDescription(), containsString("Static"));
    assertThat(room1.getDescription(), containsString("Dynamic"));
    assertThat(room1.getDescription(), containsString("sink"));

    assertThat(room2.getDescription(), containsString("Bulletproof"));
    assertThat(room2.getDescription(), containsString("Late"));
    assertThat(room2.getDescription(), containsString("elephant"));

    assertThat(room3.getDescription(), containsString("Salty"));
    assertThat(room3.getDescription(), containsString("Sour"));
    assertThat(room3.getDescription(), containsString("picture of a ghost"));
  }

}

