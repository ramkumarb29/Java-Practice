
public class Polymorphism {
	int add(int a,int b)
    {
    	return a+b;
    }
    int add(int a,int b,int c)
    {
    	return a+b+c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Polymorphism p=new Polymorphism();
    int c=p.add(3,5);
    int d=p.add(4,5,6);
    System.out.println(c);
    System.out.println(d);

	}

}
