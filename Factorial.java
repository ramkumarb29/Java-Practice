import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int fact=1;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    n=input.nextInt();
    while(n>0)
    {
    	fact=fact*n;
    	n--;
    }
    System.out.println(fact);
	}

}
