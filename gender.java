package kluy;

public class gender {

	public static void main(String[] gender) {
		int i;
		
		for(i=0;i<=5;i++)
		{
			int age = 90;
			if(gender[0]=="male")
			{
				
				if(age>=1 && age<=58)
				{
					System.out.println("percentage of interest is 8.4");
				}
				else if(age>=59 && age<=100)
				{
					System.out.println("percentage of interest is 10.5");
				}
			}
			else if(gender[0]=="female")
			{
				if(age>=1 && age<=58)
				{
					System.out.println("percentage of interest is 8.2");
				}
				else if(age>=59 && age<=100)
				{
					System.out.println("percentage of interest is 9.2");
				}
			}
		}
		

	}

}
