package myPackage;

public class ReceiptS {
	
	int value1,value2,value3,value4,value5;

	public static void main(String[] args) {
		info1();
		ReceiptS n1=new ReceiptS();
		//n1.info2();
		//info3(56060100001153l, 13, 03, 2023, 07, 22, "AK", 07, 5, 30);
		n1.info4(452, "ParleBiscuit", 5, 10);
		n1.info5(452, "SunflowerOil", 160, 05);
		n1.info6(452, "DettolSoap", 50, 10);
		n1.info7(452, "AmulGhee", 110, 2);
		n1.info8(452, "Wheat", 25, 115);
		n1.info9();
		}
		public static void info1()
		{ System.out.println("===========================================================================");
		System.out.println(" AVENUE SUPERMARKET LTD");
		System.out.println(" CIN :- L51900MH2000PLC126473");
		System.out.println(" GSTIN :- 29AACCA8432H1ZM");
		System.out.println("==========================================================================");
		}
		public static void info3(long billNo,int Day,int month,int year,int vouch,long vouch1,String cashier,int cashierNo,int hour,int min )
		{
		System.out.println(" TAX INVOICE");
		System.out.println(" Bill No : "+billNo);
		System.out.println(" Bill Dt : "+Day+"/"+month+"/"+year);
		System.out.println(" Vouch No : "+vouch+"-"+vouch1);
		System.out.println(" Cashier : "+cashier+" /"+cashierNo+" Time : "+hour+":"+min);
		System.out.println("==========================================================================="); 
		System.out.println("HSN Particulars Qty Rate Value"); 
		System.out.println("===========================================================================");
		}
		public  void info4(long hsn,String foodname,int qty,int rate)
		{
		//int value1;
		value1= qty*rate;
		System.out.println(hsn+" "+foodname+" "+qty+" "+rate+" "+value1); 
		}
		public  void info5(long hsn,String foodname,int qty,int rate)
		{
		//int value2;
		value2= qty*rate;
		System.out.println(hsn+" "+foodname+" "+qty+" "+rate+" "+value2); 
		}
		public  void info6(long hsn,String foodname,int qty,int rate)
		{
		//int value3;
		value3= qty*rate;
		System.out.println(hsn+" "+foodname+" "+qty+" "+rate+" "+value3); 
		}
		public  void info7(long hsn,String foodname,int qty,int rate)
		{
		//int value4;
		value4= qty*rate;
		System.out.println(hsn+" "+foodname+" "+qty+" "+rate+" "+value4); 
		}
		public void info8(long hsn,String foodname,int qty,int rate)
		{
		//int value5;
		value5= qty*rate;
		System.out.println(hsn+" "+foodname+" "+qty+" "+rate+" "+value5); 
		}
		public  void info9()
		{
		long sum;
		sum=(value1+value2+value3+value4+value5);
		System.out.println("============================================================================");
		System.out.println("Total : "+sum);
		}

	}


