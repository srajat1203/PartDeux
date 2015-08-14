
import java.util.ArrayList;

public class Accounts {
	
	ArrayList<AccountInfo> list;
	
	public Accounts()
	{
		list = new ArrayList<AccountInfo>();
	}
	
	public void addAccount(AccountInfo account)
	{
		list.add(account);
	}
	
	public ArrayList<AccountInfo> getAccounts()
	{
		return list;
	}
	
	public AccountInfo getAccount(int acc_num)
	{
		for(AccountInfo cur: list)
		{
			if(cur.getAccNo() == acc_num)
			{
				return cur;
			}
		}
		return null;
	}
	
	public void deleteAccount(AccountInfo acc)
	{
		AccountInfo tmp = null;
		int accno  = acc.getAccNo();
		for(AccountInfo cur: list)
		{
			int curr_accno = cur.getAccNo();
			if(curr_accno == accno)
			{
				tmp = cur;
			}
		}
		if(tmp != null)
		{
			list.remove(tmp);
		}
	}
	
}
