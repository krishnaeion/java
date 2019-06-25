package kluy;

public class Testchar {

	public static void main(String[] args) {
		char c='&';
		int ascii =(int)c;
		if((ascii>=65 && ascii<=90)||(ascii>=97&&ascii<=122))
		{
			System.out.println("character is alphabet");
			
		}
		else if(ascii>=48 && ascii<=57)
		{
			System.out.println("character is digit");
		}
		else
		{
			System.out.println("special charcter");
		}
		
	}

}
