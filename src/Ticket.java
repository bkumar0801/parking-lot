
public class Ticket {
    private final String ticketID;
    private final int level;

    Ticket(int number, int level) {
        ticketID = "IN-ORBIT-" + Integer.toString(number);
        this.level = level;
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

        return this.ticketID.equals(ticket.ticketID) &&
                this.level == ticket.level;
    }
}
