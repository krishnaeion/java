package kluy;

public class Check {

	public static void main(String[] args) {
		int len =args.length;
		int i;
		if(len==0)
		{
			System.out.println("NO Values");
			
		}
		else
		{
			for(i=0;i<=len;i++)
			{
				System.out.println(args[i]);
			}
		}

	}

}
