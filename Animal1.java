abstract class Animal2
{
	abstract void display();
	void getcolor()
	{
		System.out.println("Non Abstract");
	}
}
public class Animal1 extends Animal2
{
  void display()
   {
	  System.out.println("Abstract Method Implementation");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal1 a1=new Animal1();
    a1.display();
    a1.getcolor();
	}

}
