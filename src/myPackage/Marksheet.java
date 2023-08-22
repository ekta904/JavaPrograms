package myPackage;

public class Marksheet {

	public static void main(String[] args) {
		nameOfStudent("Prasad Yadav", "Pune", 'M');
		marks(85,80,83,90);
		percentage(85,80,83,90);
		
		nameOfStudent("Omkar Mirajkar", "Pune", 'M');
		marks(86,93,79,100);
		percentage(86,93,79,100);
		

	}
	
	public static void nameOfStudent(String name,String address,char gender)
	{
		System.out.println("==================================================");
		System.out.println("Name of Student : "+name);
		System.out.println("Address :"+address);
		System.out.println("Gender :"+gender);
	}
	
	public static void marks(int English, int Maths, int Science, int History)
	{
		System.out.println("Total Marks=========================Marks Obtained ");
		System.out.println("  100                               "+English);
		System.out.println("  100                               "+Maths);
		System.out.println("  100                               "+Science);
		System.out.println("  100                               "+History);
    }
	
	public static void percentage(int English, int Maths, int Science, int History )
	{
		int sumOfAllSubjects;
		sumOfAllSubjects= English+Maths+Science+History;
	
		System.out.println("Total Marks = "+sumOfAllSubjects);
		float per;
		per= (sumOfAllSubjects*100)/400f;
		System.out.println("Percentage = "+per+"%");
		
	}

}
