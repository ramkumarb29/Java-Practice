
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try
    {
    	//int a=100/0;
    	/*int b[]=new int[15];
    	b[16]=2;*/
    	/*String s=null;  
    	System.out.println(s.length());*/
    	String n="Ram";
        int i=Integer.parseInt(n);
   }
    catch(Exception e1)
    {
    	System.out.println(e1);
    }
    /*catch(ArithmeticException e)
    {
    	System.out.println("ArithmeticException");
    	System.out.println(e);
    }
    catch(ArrayIndexOutOfBoundsException a)
    {
    	System.out.println(a);
    }*/
	}

}
