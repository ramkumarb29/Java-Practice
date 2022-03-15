
public class ArithmeticOperations {
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	} double add(double a ,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    ArithmeticOperations ao=new ArithmeticOperations();
    int a=ao.add(11,20);
    //double b=ao.add(10.1, 5.1);
    int b=ao.add(10,20,30);
    System.out.println(a);
    System.out.println(b);
	}

}
