import java.util.ArrayList;

public class ParkingLot {
    private final int slots;
    private ArrayList<Ticket> tickets;
    private ArrayList<ParkingFullObserver> parkingFullObservers;

    public ParkingLot(int capacity)
    {
        slots = capacity;
        tickets = new ArrayList<>();
        parkingFullObservers = new ArrayList<>();
    }

    public boolean parkAt(int level)
    {
        if(isSlotAvailable()) {
            issueTicket(level);
            if(!isSlotAvailable())
                notifyObservers("Parking is Full");
            return true;
        }
        else
        {
            notifyObservers("Parking is Full");
        }
        return false;
    }

    public Ticket issueTicket(int level) {
        Ticket ticket = new Ticket(tickets.size(), level);
        tickets.add(ticket);
        return ticket;
    }

    private void notifyObservers(String message) {
        for (ParkingFullObserver observer : parkingFullObservers) {
            observer.update(message);
        }
    }

    public boolean unparkFrom(Ticket ticket)
    {
        if(isValidTicket(ticket))
        {
            if(!isSlotAvailable())
                notifyObservers("Space is available");
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
        parkingFullObservers.add(observer);
    }

    public void detach(ParkingFullObserver observer)
    {
        parkingFullObservers.remove(observer);
    }

}