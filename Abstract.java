abstract class abstract1{
abstract void display();
	{
		System.out.println("Non Abstract");
	}

}
public class Abstract extends abstract1 
   {
	   void display()
	   {
		   System.out.println("Abstract method implementation");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Abstract a=new Abstract();
    a.display();
    }

}
