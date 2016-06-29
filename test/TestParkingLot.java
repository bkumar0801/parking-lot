import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestParkingLot {
    @Test
    public void shouldBeAbleToParkWhenSlotIsAvailable() {
        ParkingLot parkingLot = new ParkingLot(2);
        assertTrue(parkingLot.parkAt(0));
        assertTrue(parkingLot.parkAt(0));
        assertFalse(parkingLot.parkAt(0));
    }

    @Test
    public void shouldBeAbleToUnparkFromTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertTrue(parkingLot.parkAt(0));
        assertTrue(parkingLot.unparkFrom(new Ticket(0, 0)));
        assertFalse(parkingLot.unparkFrom(new Ticket(0, 0)));
    }
}