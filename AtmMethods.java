package atm_app;

import java.util.HashMap;
import java.util.Map;

public class AtmMethods implements AtmOperations  {
	Atm atm=new Atm();
	Map<Double,String> statement=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance: "+atm.getBalance());
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance()) {
		statement.put(withdrawAmount," Amount Withdrawn");
		System.out.println("Amount Withdrawn");
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		else
		{
			System.out.println("insufficient Balance!!!!");
		}
	}@Override
	public void depositeAmount(double depositeAmount) {
		// TODO Auto-generated method stub
		statement.put(depositeAmount," Amount Deposited");
		System.out.println(depositeAmount+"Amount Deposited");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:statement.entrySet()) {
			System.out.println(m.getKey()+m.getValue());
		}
		
	}

}
	
