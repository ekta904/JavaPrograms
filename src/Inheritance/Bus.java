package Inheritance;

public class Bus extends Vehicle {
	
	final int a=11;

	public void Saini()

	{
		System.out.println("This is Saini Sevice");
	}

	public static void Time()
	{
         Bus bs=new Bus();
         System.out.println(bs.b);
		System.out.println("It runs at 5pm 6pm and 10 pm Daily");
	}
	public void BookTicket() {
		
		System.out.println("Want a ticket from Pune to Nagpur");
	}

	public static void TicketFare(String source, String destination) {
		
		if(source=="Pune" && destination=="Nagpur")
		{
			System.out.println("Fare is rs. 1500");
			
		}
		
		if(source=="Pune" && destination=="Wardha") {
			
			System.out.println("Fare is rs. 1000");
		}
	}

}
