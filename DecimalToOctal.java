
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal=8;
	    String octal="";
	    while(decimal>0)
	    {
	    	int rem=decimal%8;
	    	octal=rem+octal;
	    	decimal=decimal/8;
 	    }
	    System.out.print(octal);
	}

}
