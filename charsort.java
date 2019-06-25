package Helloworld;

public class charsort {

	public static void main(String[] args) {
		char a[]= {'c','a','d'};
		 
		int ascii1=(int)a[0];
		int ascii2=(int)a[1];
		int ascii3=(int)a[2];
		if(ascii1>ascii2 && ascii1>ascii3)
		{
			if(ascii2<ascii3)
			{
				System.out.println("sorted elements are 1."+(char)ascii2) ;
			}
			else
			{
				System.out.println("already sorted");
			}
		
		}

	}

}
