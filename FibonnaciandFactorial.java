import java.util.*;
public class FibonnaciandFactorial {
	 public void calculateFibonacci()
	{
        int n;
		int a=0,b=0,c=1;
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the value of n:");
	    n=input.nextInt();
	    
	    System.out.println("Fibonacci series:");
		for(int i=1;i<=n;i++)
		{		
        a=b;
		b=c;
		c=a+b;
		System.out.println(a+" ");

	}
	}
		public void calculateFactorial()
		{
			int fact=1,n;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter value of n:");
			n=input.nextInt();
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of a number is:"+fact);

		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonnaciandFactorial FF=new FibonnaciandFactorial();
		FF.calculateFactorial();
		FF.calculateFibonacci();
    }

}
