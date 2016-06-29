public class AirportSecurityStaff implements ParkingFullObserver {

    private String message;

    AirportSecurityStaff() {
        message = "";
    }
    @Override
    public void update(String message) {
        this.message = message;
    }

    public String instructSecurity()
    {
        return message + ": please route traffic!";
    }
}
