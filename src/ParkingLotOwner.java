
public class ParkingLotOwner implements ParkingFullObserver {
    private String message;

    ParkingLotOwner() {
        message = "";
    }
    @Override
    public void update(String message) {
        this.message = message;
        displayMessage();
    }

    public String displayMessage() {
        return message;
    }
}
