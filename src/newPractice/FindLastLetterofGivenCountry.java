package newPractice;

public class FindLastLetterofGivenCountry {

	public static void main(String[] args) {
		
		String[] s= {"India", "america","australia"};
		
		for(int i=0;i<=s.length-1; i++)
		{
			System.out.println(lastName(s[i]));

		}

	}

	
	public static char lastName(String countryName) {
		char c=0;
		for(int i=0;i<=countryName.length()-1;i++)
		{
		if(i==countryName.length()-1)
		{
			c=countryName.charAt(i); 

		}
		}
		return c;
		 
	}
}
