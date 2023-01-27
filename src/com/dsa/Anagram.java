package com.dsa;

public class Anagram {
	
	private static boolean anagram(char[] c1, char[] c2) {
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		if(c1.length  != c2.length)
			return false;
		
		 for (int i = 0; i < c1.length && i < c2.length;
	             i++) {
	            count1[c1[i]]++;
	            count2[c2[i]]++;
	        }
		
		for(int i=0; i<256; i++) 
			if(count1[i] != count2[i])
				return false;

		return false;
	}
	
	public static void main(String[] args) {
		String s1 = "silent";
		char[] c1 = s1.toCharArray();
		String s2 = "listee";
		char[] c2 = s2.toCharArray();
		System.out.println(anagram(c1, c2));
	}


}
