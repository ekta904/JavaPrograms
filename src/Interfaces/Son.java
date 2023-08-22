package Interfaces;

public class Son implements Father,Mother{

	public static void main(String[] args) {
		Son s= new Son();
		s.beuty();
		s.car();
		//s.love();
		s.nature();
		s.house();
		s.love();
		Father.emotions();
		Mother.emotions();
		
		System.out.println();

	}

	@Override
	public void beuty() {
		// TODO Auto-generated method stub

	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub

	}

	@Override
	public void house() {
		// TODO Auto-generated method stub

	}

	@Override
	public void car() {
		// TODO Auto-generated method stub

	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		Father.super.love();
	}

//	@Override
//	public void love() {
//		// TODO Auto-generated method stub
//		Father.super.love();
//		//Mother.super.love();
//	}

}
