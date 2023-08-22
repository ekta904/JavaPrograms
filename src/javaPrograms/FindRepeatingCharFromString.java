package javaPrograms;

import java.util.HashMap;
import java.util.Set;

public class FindRepeatingCharFromString {

	public static void main(String[] args) {

		String s="pqrpqrabcxyzabcpqr";

		HashMap<Character, Integer> mp=new HashMap<>();

		for(int i=0;i<=s.length()-1;i++) {

			char temp = s.charAt(i);
			if(mp.containsKey(temp))
			{
				mp.put(temp, mp.get(temp)+1);
			}
			else {
				mp.put(temp,1);
			}	

		}
		Set<Character> myKey = mp.keySet();
		
		for(Character m:myKey)
		{
			System.out.println(m+":"+mp.get(m));
		}
		
		System.out.println("=======to print values >2 ======");
		
		for(Character m:myKey)
		{
			if(mp.get(m)>2)
			{
				System.out.println(m+":"+mp.get(m));
			}
		}
	}

}
