package Inheritance;

public class Train extends Vehicle {

	public void BookTicket()
	{
		System.out.println("Want a ticket from Pune to Bengaluru");
		
	}
	
	public static void TicketFare(String source, String destination)
	{
		if(source=="Pune" && destination=="Mumbai")
		{
			System.out.println("Fare is rs. 100");
			
		}
		
		if(source=="Pune" && destination=="Bengaluru") {
			
			System.out.println("Fare is rs. 1000");
		}
	}	
	
	

}
