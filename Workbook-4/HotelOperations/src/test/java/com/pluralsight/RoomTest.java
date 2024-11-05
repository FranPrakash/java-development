package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    //testing checkIn()
    @Test
    public void after_CheckIn_room_should_be_occupied() {
        //arrange
        Room myRoom = new Room(false, false, 1, 20.0f);
        boolean expectedOccupied = true; //expected value

        //act call the method
        myRoom.checkIn();

        //Assert check
        boolean actualOccupied = myRoom.isOccupied(); //actual value
        assertEquals(expectedOccupied, actualOccupied); //checking expected occupied with actual occupied
    }

    @Test // test check out
    public void after_checkOut_room_should_be_available() {

        //arrange
        Room myRoom = new Room(true, true, 1, 20.0f); //Occupied true "people are still in the room"
        boolean expectedAvailable = true;

        //act call the method
        myRoom.checkOut();

        //Assert check
        boolean actualAvailable = myRoom.isAvailable(); //Actual Value
        assertEquals(expectedAvailable, actualAvailable);

    }

    @Test // test CleanRoom
    public void after_cleaning_Room_Should_not_be_dirty() {
        Room myRoom = new Room(true, true, 1, 20.0f);
        boolean expectedDirty = false;

        //clean room
        myRoom.cleanRoom();

        //assert
        boolean actualDirty = myRoom.isDirty();
        assertEquals(expectedDirty, actualDirty);
    }

    @Test //Test room if
    public void after_CheckIn_Room_Should_be_dirty() {
        Room myRoom = new Room(false, false, 1, 20.0f);
        boolean expectedDirty = true;

        //act call method room is occupied
        myRoom.checkIn();

        //Assert
        boolean actualDirty = myRoom.isDirty();
        assertEquals(expectedDirty, actualDirty);
    }



}

   //TODO: checkin should fail if room is occupied
   //TODO: checkin should fail if room is dirty
   //TODO: clean room should fail if room is occupied
