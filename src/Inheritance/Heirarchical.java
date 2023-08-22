package Inheritance;

public class Heirarchical {

	public static void main(String[] args) {
		
			
			Train t=new Train();
			Train.PublicTransport();
			t.BookTicket();
			Train.TicketFare("Pune", "Bengaluru");
			System.out.println("==============================");
			Bus b= new Bus();
			b.Saini();
			Bus.Time();
			Bus.PublicTransport();
			b.BookTicket();
			Bus.TicketFare("Pune", "Wardha");
		
		
	}

}
