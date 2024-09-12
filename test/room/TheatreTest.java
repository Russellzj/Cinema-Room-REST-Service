package room;

import cinema.room.Seat;
import cinema.room.Theatre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TheatreTest {

    @Test
    @DisplayName("Initialize Theatre with all seats filled")
    public void testTheatreInit() {
        Theatre myTheatre = new Theatre();
        Seat[] seats = myTheatre.getSeats();
        for (int i = 0; i < seats.length; i++) {
            Assertions.assertTrue(seats[i] != null);
        }
    }
}
