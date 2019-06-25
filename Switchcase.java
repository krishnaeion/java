package kluy;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		String colourcode;
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		colourcode=input.next();
		switch(colourcode)
		{
		case "o":System.out.println("orange");break;
		case "g":System.out.println("green");break;
		case "r": System.out.println("red");break;
		case "y":System.out.println("yellow");break;
		case "b":System.out.println("brown");break;
		default:System.out.println("invalid code");break;
		}
		

	}

}
