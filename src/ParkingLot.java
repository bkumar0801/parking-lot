import java.util.ArrayList;

public class ParkingLot {
    private final int slots;
    private ArrayList<Ticket> tickets;
    private ArrayList<ParkingFullObserver> observers;
    private boolean parkingFull;

    public ParkingLot(int capacity)
    {
        slots = capacity;
        tickets = new ArrayList<>();
        observers = new ArrayList<>();
        parkingFull = false;
    }

    public boolean park()
    {
        if(isSlotAvailable()) {
            tickets.add(new Ticket());
            return true;
        }
        else
        {
            parkingFull = true;
            notifyObservers();
        }
        return false;
    }

    private void notifyObservers() {
        for (ParkingFullObserver observer : observers) {
            observer.update(parkingFull);
        }
    }

    public boolean unpark(Ticket ticket)
    {
        if(isValidTicket(ticket))
        {
            tickets.remove(ticket);
            return true;
        }
        return false;
    }

    private boolean isValidTicket(Ticket ticket) {
        for (Ticket issuedTicket : tickets) {
            if(issuedTicket.equals(ticket)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSlotAvailable()
    {
        return tickets.size() < slots;
    }

    public void attach(ParkingFullObserver observer)
    {
        observers.add(observer);
    }

    public void detach(ParkingFullObserver observer)
    {
        observers.remove(observer);
    }
}