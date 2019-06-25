package kluy;
public class Uppercase {

	public static void main(String[] args) {
	  char c='A';
	  if(Character.isUpperCase(c))
	  {
		  char k =Character.toLowerCase(c);
		 
		  System.out.println(""+k+"->"+c);
	  }
	  else if(Character.isLowerCase(c))
	  {
		  char y=Character.toUpperCase(c);
		  System.out.println(""+y+"->"+c);
	  }

	}

}
