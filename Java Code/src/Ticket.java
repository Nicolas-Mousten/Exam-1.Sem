import java.util.ArrayList;

public class Ticket {
    private String eventName;
    private String date;
    private boolean isUsed;
    static private ArrayList<Ticket> tickets;
    static private int numberOfTickets;

    public Ticket(String eventName, String date, boolean isUsed){
        this.eventName = eventName;
        this.date = date;
        this.isUsed = isUsed;
        numberOfTickets++;
    }
    static public void addTicket(Ticket input){
        tickets.add(input);
    }
    static public int getNumberOfTickets(){
        return numberOfTickets;
    }

    public static int usedTickets(){
        int ticketsUsed =0;
        for (int i = 0; i < tickets.size(); i++) {
            if(tickets.get(i).isUsed== true){
                ticketsUsed++;
            }
        }
        return ticketsUsed;
    }
}

class test{
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("NewYear","11 April 2021", false);
        Ticket ticket2 = new Ticket("NewYear","11 April 2021", true);
        Ticket ticket3 = new Ticket("NewYear","11 April 2021", true);
        Ticket.addTicket(ticket1);
        Ticket.addTicket(ticket2);
        Ticket.addTicket(ticket3);

        //System.out.println(Ticket.usedTickets());
        System.out.println(Ticket.getNumberOfTickets());
    }
}