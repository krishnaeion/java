package kluy;
import java.util.Scanner;
public class Checkprime {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner input=new Scanner(System.in);
	int  prime =input.nextInt();
	int i=2;
	if(prime==0||prime==1)
	{
		System.out.println("num is not prime");
	}
	else
	{
		for(i=2;i<=(prime)/2;i++)
		{
			if(prime%i==0)
			{
				System.out.println("the num is not prime");
			}
			else
			{
				System.out.println("number is prime");
			}
		}
	}
	
	
		

	}

}
