
public class Super {
	public void move()
    {
    	System.out.println("Animals can move");
    }

    class Super1 extends Super
    {
    	public void move()
    	{
    	super.move();
    	System.out.println("Animals can walk");
    }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Super s=new Super();
    Super s1=s.new Super1();
    s1.move();	
	}
}
