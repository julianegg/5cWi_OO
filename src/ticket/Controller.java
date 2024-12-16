package ticket;

import java.util.ArrayList; 

public class Controller {
    
    Printer printer;
    
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();  

    
    public Controller(Printer printer) {
        this.printer = printer;
         
    }

    public void createTicket(){
       
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);  
    }
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
}
