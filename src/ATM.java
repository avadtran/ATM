import java.util.HashMap;
import java.util.Map;

public class ATM {
	private String id;
	private double moneyAmount;
	
	Map<String, Double> accountLibrary = new HashMap<String, Double>();
	
	public void deposit(String id, double moneyAmount)
	{
		this.id = id;
		this.moneyAmount = moneyAmount;
		
		if (accountLibrary.containsKey(id))
			accountLibrary.replace(id, moneyAmount);
		else
			accountLibrary.put(id, moneyAmount);
		//
	}}
