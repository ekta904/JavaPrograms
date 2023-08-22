package generalization;

public class Generalization_Implementation {

	public static void main(String[] args) {

             
		
		Oppo o= new Oppo();
		o.calling();
		o.camera();
		o.maps();
		o.sms();
		o.fast_Charging();
		System.out.println("==================================");
		
		Redmi r= new Redmi();
		r.calling();
		r.camera();
		r.maps();
		r.sms();
		r.fingerPrint_Sensor();
		System.out.println("===============================");
		
		Samsung s= new Samsung();
		s.calling();
		s.camera();
		s.maps();
		s.sms();
		s.amoled_Display();
		
	}
	
	

}
