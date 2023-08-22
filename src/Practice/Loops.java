package Practice;

public class Loops {

	public static void main(String[] args) {
		 int weeks = 3;
	        int days = 7;
	        int i = 1;
	 
	        // outer loop
	        while (i <= weeks) {
	            System.out.print("Week: " + i);
	 
	            // inner loop
	            for (int j = 1; j <= days; ++j) {
	                System.out.print("  Days:   " + j+"  ");
                
	            	switch(j)
	            	{
	            	case 1:
	            		System.out.println("Monday");
	            		break;
	            		
	            	case 2:
	            		System.out.println("Tuesday");
	            		break;
	            		
	            	case 3:
	            		System.out.println("Wednesday");
	            		break;
	            		
	            	case 4:
	            		System.out.println("Thrusday");
	            		break;
	            		
	            	case 5:
	            		System.out.println("Friday");
	            		break;
	            		
	            	case 6:
	            		System.out.println("Saturday");
	            		break;
	            		
	            	case 7:
	            		System.out.println("Sunday");
	            		break;
	            		
	            	}
	            	
	            }
	            ++i;
	        }
	}

}
