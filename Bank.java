
public class Bank {
	public void rateofinterest()
	{
		System.out.println("Bank");
	}
	class SBI extends Bank {
		public void rateofinterest()
		{
			System.out.println("SBI");
		}
	}
   class HDFC extends Bank {
			public void rateofinterest()
			{
				System.out.println("HDFC");
			}
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Bank a1=new Bank();
   SBI b1=a1.new SBI();
   HDFC c1=a1.new HDFC();
   c1.rateofinterest();
	}

}
