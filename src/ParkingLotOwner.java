
public class ParkingLotOwner implements ParkingFullObserver {
    private final boolean parkingState;

    ParkingLotOwner() {
        this.parkingState = true;
    }
    @Override
    public void update(boolean parkingState) {
        if(this.parkingState == parkingState)
            displayParkingFull();
    }

    public String displayParkingFull() {
        return "Parking is Full";
    }
}
