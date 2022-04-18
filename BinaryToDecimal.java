
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int binary=1010;
    int decimal=0,i=0;
    while(binary>0)
    {
    	int remainder=binary%10;
    	decimal=(int) (decimal+(remainder*Math.pow(2,i))) ;
    	binary=binary/10;
    	i++;
    }
    System.out.print(decimal);
	}

}
