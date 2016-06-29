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
        assertEquals("Parking is Full", parkingLotOwner.displayParkingFull());
    }
}
