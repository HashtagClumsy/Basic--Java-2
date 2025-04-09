import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = s.nextInt();
	    int n2 = s.nextInt();
	    System.out.println("Enter your choice:\n 1. Add\n 2. Subtract\n 3. Multiplication\n 4. Divide");
	    int ch = s.nextInt();
	    int res = 0;
		switch (ch)
	    {
	    case 1: res  = n1+n2;break;
	    case 2: res = n1-n2; break;
	    case 3: res = n1*n2; break;
	    case 4: res = n1/n2; break;
	    default : System.out.println("Invalid Option");
	    System.exit(1);// used to come out of program
	    }
	    System.out.println("Result = " +res);
	}

}
