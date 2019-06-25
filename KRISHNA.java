package Helloworld;
import java.util.Scanner;
public class KRISHNA {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=number.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
			System.out.println("\n");
			
		}
		else if(n<0)
		{
			System.out.println("number is negative");
		}
		else if(n==0)
		{
			System.out.println("number is zero");
		}
		
		

        
	}

}
