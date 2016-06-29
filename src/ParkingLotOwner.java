
public class ParkingLotOwner implements ParkingFullObserver {
    private String message;

    ParkingLotOwner() {
        message = "";
    }
    @Override
    public void update(String message) {
        this.message = message;
        displayParkingFull();
    }

    public String displayParkingFull() {
        return message;
    }
}
