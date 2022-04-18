
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int decimal=439;
   String binary="";
   while(decimal>0)
   {
	   int remainder = decimal%2;
	   binary=remainder+binary;
	   decimal=decimal/2;
   }
   System.out.print(binary);
	}

}
