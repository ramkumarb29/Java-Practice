import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int f=0,s=1,n,t;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n=input.nextInt();
    System.out.println("Fibonnaci series:");
    for(int i=1;i<n;i++)
    {
    	System.out.println(f);
    	t=f+s;
    	f=s;
    	s=t;
    }

	}

}
