package practice2;

public class Patterns {

	public static void main(String[] args) {

		for(int i=0;i<=5;i++) {

			System.out.print("*"+" ");
		}
		System.out.println();
		System.out.println("=====================");
		for(int i=0;i<=5;i++) {

			for(int j=0;j<=5;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		System.out.println("=====================");
		int space=0;
		int star=5;
		for(int i=0;i<=5;i++) {

			for(int j=0;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=star;k++) {
				System.out.print("*");
			}
			space++;
			star--;
			System.out.println();

		}

		System.out.println("====================");
		int space1=5;
		int star1=0;
		for(int i=0;i<=5;i++) {

			for(int j=0;j<=space1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=star1;k++) {
				System.out.print("*");
			}
			space1--;
			star1++;
			System.out.println();

		}
		System.out.println("=======================");
		
		for(int i=5;i>=0;i--)
		{    
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
