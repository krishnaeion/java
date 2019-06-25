package Helloworld;

import java.util.Arrays;

public class Char {

	public static void main(String[] args) {
		char a[]= {'u','y','c','d','e'};
		for(char value : a)
		{
			System.out.println("array elents are");
			System.out.println("value="+value);     
		}
		Arrays.parallelSort(a);
		
	for (char number  : a)
	{
		System.out.println("sorted elements are");
		System.out.println("number="+number);
	}

}
}
