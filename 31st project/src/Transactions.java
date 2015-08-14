import java.util.ArrayList;

public class Transactions {

	ArrayList<Transaction> list;
	
	
	public Transactions()
	{
		list = new ArrayList<Transaction>();
	}
	
	public void addTransaction(Transaction transaction)
	{
		list.add(transaction);
	}
	
	public ArrayList<Transaction> getTransactions()
	{
		return list;
	}
	
	public Transaction prev_transaction()
	{
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			return list.get(0);
		}
	}
	
}


