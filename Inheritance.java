
class one {
    public void print_one()
    {
        System.out.println("One");
    }
}
 
class two extends one {
    public void print_two() 
    { 
    	System.out.println("Two"); 
    }
}
class three extends two {
    public void print_three()
    {
        System.out.println("Three");
    }
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three t = new three();
        t.print_one();
        t.print_two();
        t.print_three();
	}

}

