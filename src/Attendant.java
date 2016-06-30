import java.util.ArrayList;

public class Attendant {
    private final ArrayList<ParkingLot> parkingLots;

    public Attendant(int levels, int capacity)
    {
        parkingLots = new ArrayList<>();
        for(int index = 0; index < levels; ++index) {
            parkingLots.add(new ParkingLot(capacity));
        }
    }

    public boolean park() {
        for(ParkingLot parkingLot: parkingLots) {
            if(parkingLot.isSlotAvailable()) {
                return parkingLot.parkAt(parkingLots.indexOf(parkingLot));
            }
        }
        return false;
    }

    public boolean unpark(Ticket ticket) {
        return false;
    }
}
