package javaPrograms;

import java.util.HashMap;
import java.util.Set;

public class FindRepeatatingStringFromString {

	public static void main(String[] args) {


		String str="abc abc xyz pqr abc xyz";
		HashMap<String, Integer> mp= new HashMap<String, Integer>();
		String[] ar = str.split(" ");//{"abc" "abc" "xyz" "pqr" "abc" "xyz"}
		for(int i=0;i<=ar.length-1;i++)
		{
			String temp = ar[i];
			if(mp.containsKey(temp))
			{
				mp.put(temp, mp.get(temp)+1);
			}
			else
			{
				mp.put(temp, 1);
			}
		}
		//System.out.println(mp);
		Set<String> myKey = mp.keySet();
		for(String m:myKey)
		{
			System.out.println(m+":"+mp.get(m));
		}
		System.out.println("====only repeating >=3 times=======");
		for(String m:myKey)
		{
			if(mp.get(m)>=3)
			{
				System.out.println(m+":"+mp.get(m));
			}
		}
	}

}
