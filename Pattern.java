package practice;
import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern
    System.out.println("   J    a   v    v    a");
    System.out.println("   J   a a   v  v    a a");
    System.out.println("J  J  aaaaa   V V   aaaaa");
    System.out.println(" JJ  a     a   V   a     a");
    //expression
    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    //area and perimeter of a circle
    double r=7.5;
    double area,perimeter;
    area=Math.PI*Math.pow(r, 2);
    perimeter=2*Math.PI*r;
    System.out.println("Area:"+area+"\n"+"Perimeter:"+perimeter);
    //swap of two numbers
    int a,b,temp;
    a=15;
    b=23;
    System.out.println("Before Swapping a,b: "+a+" "+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After Swapping a,b:"+a+" "+b);
	}   

}
