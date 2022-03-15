
class AccessModifiers {
	private void print_name()
	{
		System.out.println("Name1:");
	}
	void print_id1()
	{
		System.out.println("id1:");
	}
	protected void print_nam() 
	{
		System.out.println("Nam:");
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AccessModifiers a=new AccessModifiers();
    a.print_name();
    a.print_id1();
    a.print_nam();
	}

	
}

