package practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int num=input.nextInt();
    
    for(int i=0;i<10;i++)
    {
    	System.out.println(num+ "x" + (i+1) + "=" + (num*(i+1)));
    }
	}

}
