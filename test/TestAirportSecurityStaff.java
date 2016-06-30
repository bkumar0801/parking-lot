import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestAirportSecurityStaff {
    @Test
    public void shouldBeAbleToRouteTraffic()
    {
        ParkingLot parkingLot = new ParkingLot(2);
        AirportSecurityStaff airportSecurityStaff = new AirportSecurityStaff();
        parkingLot.attach(airportSecurityStaff);
        parkingLot.parkAt(0);
        parkingLot.parkAt(0);
        assertEquals("Parking is Full: please route traffic!", airportSecurityStaff.instructSecurity());
    }
}
