package com.lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.io.*;

class Pair
{
  int first, second;
  Pair(int a, int b)
  {
    first = a;
    second = b;
  }
}


public class MissingElements {
	

	private static ArrayList<Pair> findSubArrays(int[] a, int length) {
		ArrayList<Pair> out = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			int pre = 0;
			for(int j=i; j<a.length; j++) {
				pre += a[j];
				if(pre == 0)
					 out.add(new Pair(i, j));
			}
		}
		return out;
	}

	

	
	public static void main(String[] args) {
		int a[] = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
       
	
		ArrayList<Pair> out =  findSubArrays(a, a.length);
		
		if(out.size() == 0)
			System.out.print("No Subarray exists");
		else {
			for(int i=0; i<out.size(); i++) {
				Pair p = out.get(i);
				System.out.println(p.first + " to " + p.second);
			}
		}
		}
}




