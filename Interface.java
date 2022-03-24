interface Animal
{
	void display();
}
interface Bird
{
	void display1();
}
public class Interface implements Animal,Bird {
	public void display()
	{
		System.out.println("Interface");
}
	public void display1()
	{
		System.out.println("Interface1");
	}
	
     
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Interface i=new Interface();
    i.display();
    i.display1();
	}

}
