import java.util.GregorianCalendar;
import java.util.Date;
import java.util.StringTokenizer;


public class Transaction {
	

	private int month;
	private int day;
	private int year;
	private double amount;
	GregorianCalendar gc;
	private int type;
	
	public Transaction(int year, int month, int day, double amount, int type)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.amount = amount;
		this.type = type;
		gc = new GregorianCalendar(year, (month - 1), day);
		
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
	
	public int getTime()
	{
		GregorianCalendar odate = new GregorianCalendar(year, month, day);
		GregorianCalendar now = new GregorianCalendar();
		
		Date startDate = odate.getTime();
		Date endDate = now.getTime();
		long startDateMS = startDate.getTime();
		long endDateMS = endDate.getTime();
		long elapsedMS = endDateMS - startDateMS;
		long elapsedDays = elapsedMS / (24*60*60*1000);
		
		int days = (int)elapsedDays;
		return  days;
	}
	   
	public String dateToString()
	{
		String date = new String(day + "/" + month + "/" + year);
		return date;
	}
	
	public void Stringtodate(String s)
	{
		StringTokenizer strtok;
		StringTokenizer strtok2;
		
		strtok = new StringTokenizer(s,"-");
		strtok2 = new StringTokenizer(s," ");
		
		String space = new String(" ");
		
	

		while(strtok.hasMoreTokens())
		{
			year = Integer.parseInt(strtok.nextToken());
			month = Integer.parseInt(strtok.nextToken());
			day = Integer.parseInt(strtok.nextToken());
		}
	}	
	
	
	
}
