import java.util.*;
import java.util.HashMap;


public class SimpleATM 
{   

	private HashMap <String, Double > b = new HashMap <String, Double>();

	public SimpleATM() {
		
	}
		
	public void deposit(String bankID, double amount){
		if (amount>0){
			if (b.containsKey(bankID)){
				b.put(bankID, b.get(bankID)+amount);
				System.out.println("Balance $"+amount+" deposited into account "+bankID+".");
				return;
			}else{
				b.put(bankID, amount);
				System.out.println("Account "+bankID+" created with balance $"+amount+".");
				return;
			}
		}else{
			System.out.println("Invalid deposit amount.");
			return;
		}
	}
	
	public String checkBalance(String id) {
		if(b.containsKey(id)) {
			return ("Balance of account "+id+" is $"+b.get(id)+".");
		}else {
			return ("Invalid ID: "+id+".");
		}
	}
	
	public void withdraw(String bankID, double amount) {
		if(amount>0) {
			if(b.containsKey(bankID)) {
				if(b.get(bankID)-amount>-1) {
					b.put(bankID, b.get(bankID)-amount);
					System.out.println("$"+amount+" withdrawn from account "+bankID);
				}else {
					System.out.println("Account "+bankID+" has insufficient funds ($"+b.get(bankID)+").");
					return;
				}
			}else {
				System.out.println("Invalid ID: "+bankID+".");
				return;
			}
		}else {
			System.out.println("Invalid withdraw amount.");
			return;
		}
	}
}

