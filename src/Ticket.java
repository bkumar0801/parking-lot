
public class Ticket {
    private final String ticketID;
    private static int number;

    Ticket() {
        ticketID = "IN-ORBIT-" + Integer.toString(number++);
    }

    Ticket(int number) {
        ticketID = "IN-ORBIT-" + Integer.toString(number);
    }

    @Override
    public boolean equals(Object object) {

        if (object == this) {
            return true;
        }

        if (!(object instanceof Ticket)) {
            return false;
        }

        Ticket ticket = (Ticket) object;

        return this.ticketID.equals(ticket.ticketID);
    }
}
