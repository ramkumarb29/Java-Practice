
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m=0,j=0,num = 6;
		m=num/2;
		if(num==0||num==1)
		{
			System.out.println("Not a prime number ");
		}
		else
			{
			for(i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					System.out.println("Not a prime number");
					j=1;
				}
			}
		if(j==0)
		{
			System.out.println("Prime number");
		}
			}
	}
}