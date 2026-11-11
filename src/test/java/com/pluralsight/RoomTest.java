package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
  public  void checkIn_OccupiesAnAvailableRoom_True() {
        // Arrange
        Room room = new Room(2, 99.99);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());}

@Test
public void isAvailable_isRoomCleanAndEmpty_False(){

//Arrange
Room room = new Room(1,29.99);


//Act
room.isAvailable();


//Assert
assertFalse(room.isOccupied());
assertFalse(room.isDirty());



}@Test
public void punchTimeCard_howManyHoursClockedIn_numberOfHoursWorked() {
//Arrange
Employee employee = new Employee(23, "HR","department",2121);
double punchInClock = 0;
double punchOutClock = 8.5;
double expectedHoursWorked = 8.5;


//Act
employee.punchTimeCard(punchInClock);
employee.punchTimeCard(punchOutClock);


//Assert

assertEquals(punchOutClock,expectedHoursWorked);









}
}