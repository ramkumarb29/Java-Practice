
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number=171;
    int number2=number;
    int Arm=0;
    do
    {
    	int rem=number%10;
    	Arm=Arm+(rem*rem*rem);
    	number=number/10;
    }
    while(number>0);
	System.out.println(Arm);
	if(number2==Arm)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not an Armstrong Number");
	}
	}

}
