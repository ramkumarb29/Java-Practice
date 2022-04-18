
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number=121;
    int number2=number;
    int rem=0;
    while(number>0)
    {
    	rem=(rem*10)+number%10;
    	number=number/10;
    }
    System.out.println(rem);
    if(rem==number2)
    {
    	System.out.println("Palindrome number");
    }
    else
    {
    	System.out.println("Not a palindrome number");
    }
	}

}
