import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestParkingLot {
    @Test
    public void shouldBeAbleToParkWhenSlotIsAvailable() {
        ParkingLot parkingLot = new ParkingLot(2);
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertFalse(parkingLot.park());
    }

    @Test
    public void shouldBeAbleToUnparkFromTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.unpark(new Ticket(0)));
        assertFalse(parkingLot.unpark(new Ticket(0)));
    }
}