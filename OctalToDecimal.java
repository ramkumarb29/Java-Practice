
public class OctalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int octal=121;
    int decimal=0,i=0;
    while(octal>0)
    {
    	int rem=octal%10;
    	decimal=(int) (decimal+(rem*Math.pow(8,i)));
    	octal=octal/10;
    	i++;
    }
    System.out.print(decimal);
	}

}
