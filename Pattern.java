/*
 * *****
 * ****
 * ***
 * **
 * *
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, rows=5;  
		//Prints upper half  pattern  
		for (i = rows; i >= 1; i--)   
		{  
		for (j = 1; j <= i; j++)  
		{  
		System.out.print("*");  
		}  
		System.out.println();  
		}  
		//Prints lower half  pattern  
		for (i = 1; i <= rows; i++)   
		{  
		for (j = 1; j <= i; j++)  
		{  
		System.out.print("*");  
		}  
		System.out.println();  
    }
	}
}
		/*int count=0;
		String s="I am Ram kumar B";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
				count++;
			
		}
		System.out.println(count);*/
		



