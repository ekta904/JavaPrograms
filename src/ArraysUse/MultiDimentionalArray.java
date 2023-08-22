package ArraysUse;

public class MultiDimentionalArray {

	public static void main(String[] args) {


		int x[][]= {{1,2,3},{4,5,6}};

		for(int i=0;i<=x.length-1;i++) {//this for loop is for rows 
			for(int j=0;j<=x.length;j++) {//this for loop is for columns
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		method2();
		

	}
	
	public static void method2() {
		
		int arr[][]=new int[3][3];
		
		arr[0][0]=100;
		arr[0][1]=120;
		arr[1][0]=129;
		arr[1][1]=144;
		arr[0][2]=452;
		arr[1][2]=654;
		arr[2][2]=980;
		arr[2][0]=200;
		arr[2][1]=300;
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}

		
	}

}
