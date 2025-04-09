import java.util.Scanner;

public class breakDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		while (true)
		{
			System.out.println("Enter a number");
			int n = s.nextInt();
			if (n == 0)
				break;
			sum = sum+n;
			
		}
		System.out.println(sum);
	}

}
