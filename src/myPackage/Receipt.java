package myPackage;

public class Receipt {

	
	public static void main(String[] args) {
        Receipt r = new Receipt();  
		items(1,1,1,1,1,1,1);
		r.payment(0,1);
	}
	
	public Receipt() {
		
		System.out.println("      Avanya Restaurent     ");
		System.out.println("      Vishrantwadi Pune     ");
		System.out.println("             411015          ");
		
	System.out.println("=================================");
	System.out.println("      Merchant ID : AB03         ");
	System.out.println("=================================");
	System.out.println("GST ID:                      7999");
	}
	
	public static void items(int a,int b,int c, int d,int e,int f,int g) {
		 float total=0;
		 
		 System.out.println("Items Added"+"              "+"Price in Rupees");
		 System.out.println("====================================");
		if(a==1) {
			
		System.out.println("Panner Butter Masala" + "        250");
		 total = total+250;
		 
		}
		if(b==1)
		{
			System.out.println("Butter Naan"+ "                 50");
			total=total+50;
		}  
		if(c==1)
		{
			System.out.println("Daal Khichadi"+"               150");
			total= total +150;
		}
		if(d==1) {
			System.out.println("Faluda"+"                      200");
			total=total+200;
		}
		if(e==1) {
			System.out.println("Dum Aaloo"+"                   250");
			total=total+200;
		}
		if(f==1) {
			System.out.println("Masala Dosa"+"                 120");
			total=total+200;
		}if(g==1) {
			System.out.println("Rawa Idli"+"                   120");
			total=total+200;
		}
		float gst;
		gst=(18*total/100);
		System.out.println("GST"+"                         "+gst);
		total=total+gst;
		System.out.println("==================================");
		System.out.println("Total="+"                     "+total+"rs");
	}

	public void payment(int card, int cash) {
		System.out.println("==================================");
		if(card==1) {
			
			System.out.println("Paid by:                   card");
		}
		if(cash==1) {
			System.out.println("Paid by:                   cash");
		}
		System.out.println("==================================");
		System.out.println("Thanks and Visit again!");
	}
}
