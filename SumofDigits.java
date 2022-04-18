package practice;

import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		    System.out.println("Enter number:");
		    int n=input.nextInt();
		    System.out.println("The sum of the digits is: " + sumDigits(n));

    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = n + n % 10;
            n = n/ 10;
        }
        return sum;
		    
    }
}
