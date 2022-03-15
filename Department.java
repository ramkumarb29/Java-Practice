
public class Department {
	int id=3;
	String name="EEE";
	void Department()
	{
		id=2;
		name="ECE";
	}
	void getvalues(int i,String n)
	{
		id=i;
		name=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Department d1=new Department();
    //d1.getvalues(1,"CSE");
    //d1.Department();
    System.out.println(d1.id);
    System.out.println(d1.name);
	}

}
