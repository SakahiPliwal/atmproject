package atm_app;
import java.util.Scanner;
public class ATM_running {

	public static void main(String[] args) {
		 Scanner Scanner = new Scanner(System.in);
		 AtmMethods options=new AtmMethods();
			System.out.println("welcome to a Bank");
			System.out.println("enter your ATM number: ");
			int atmNumber=12345678;
			
			int inputNum=Scanner.nextInt();
			
			System.out.println("enter your ATM pin: ");
			int atmPin=1234;
			int inputPin=Scanner.nextInt();
			
			if((atmNumber==inputNum)&&(atmPin==inputPin))
			{
				System.out.println("HELLO USER");
				
				while(true)
				{
					System.out.println("1.View avilable Balance :\n2.Withdraw Amount :\n3.Deposite Amount :\n4.View miniStartement :\n5.Exit");
					int ch=Scanner.nextInt();
					if(ch==1)
					{
						options.viewBalance();
					}
					else if(ch==2)
					{
						System.out.println("Enter the amount to withdraw :");
						double amountOut=Scanner.nextDouble();
						options.withdrawAmount(amountOut);
						
					}
					else if(ch==3) 
					{
						System.out.println("Enter the amount to deposite :");
						double amountIn=Scanner.nextDouble();
						options.depositeAmount(amountIn);
					}
					else if(ch==4)
					{
						options.viewMiniStatement();
					}
					else if(ch==5)
					{
						System.out.println("Thank you visite again");
					}
					else
					{
						System.out.println("enter correct details");
					}
				}
			}
		else	
		{
			System.out.println("enter correct details");
		}
		

	}

}
