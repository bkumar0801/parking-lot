import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestParkingLotOwner {
    @Test
    public void shouldBeAbleToDisplayParkingFullMessage()
    {
        ParkingLot parkingLot = new ParkingLot(2);
        ParkingLotOwner parkingLotOwner = new ParkingLotOwner();
        parkingLot.attach(parkingLotOwner);
        parkingLot.parkAt(0);
        parkingLot.parkAt(0);
        assertEquals("Parking is Full", parkingLotOwner.displayMessage());
    }

    @Test
    public void shouldBeAbleToDisplaySpaceAvailableMessage()
    {
        ParkingLot parkingLot = new ParkingLot(1);
        ParkingLotOwner parkingLotOwner = new ParkingLotOwner();
        parkingLot.attach(parkingLotOwner);
        parkingLot.parkAt(0);
        assertEquals("Parking is Full", parkingLotOwner.displayMessage());
        parkingLot.unparkFrom(new Ticket(0, 0));
        assertEquals("Space is available", parkingLotOwner.displayMessage());
    }

}
