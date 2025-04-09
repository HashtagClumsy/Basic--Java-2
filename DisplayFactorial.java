
public class DisplayFactorial {

	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println(" Number  Factorial");
		System.out.println("---------------------");

		int  sum=0;
		for(int i =1;i<=5;i++)
		{
			int fact = 1;
			for(int j=i;j>=1;j--)
			{
				fact   = fact*j;
			}
			sum = sum+fact;
			System.out.println("   "  +i+"     " +fact);
		}
		// with while loop
		/*int i = 1;
		while(i<=5)
		{
			int fact =1;
			for(int j=i;j>=1;j--)
			{
				fact  = fact*j;
			}
		sum = sum+fact;
		System.out.println("   "  +i+"     " +fact);
		i++;

		}*/
		System.out.println("---------------------");
		System.out.println(" sum = " +sum);
		System.out.println("---------------------");
	}

}

