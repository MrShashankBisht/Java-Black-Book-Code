import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		Locale usLocale=new Locale("eg", "US");
		Locale frenchLocale=new Locale("fr", "FR");
		
		DateFormat usFormatter=DateFormat.getDateInstance(DateFormat.DEFAULT, usLocale);
		DateFormat frenchFormatter=DateFormat.getDateInstance(DateFormat.DEFAULT, frenchLocale);
		
		DateFormat usTimeFormat=DateFormat.getTimeInstance(DateFormat.DEFAULT, usLocale);
		DateFormat frenchTimeFormat=DateFormat.getTimeInstance(DateFormat.DEFAULT, frenchLocale);
				
		Date today = new Date();
		
		String usDate=usFormatter.format(today);
		String frenchDate=frenchFormatter.format(today);
		
		String usTime=usTimeFormat.format(today);
		String frechTime=frenchTimeFormat.format(today);
			
		System.out.println("Locale: "+usLocale.getDisplayCountry());
		System.out.println("Date: "+usDate);
		System.out.println("Time: "+usTime);
		
		System.out.println("\nLocale: "+frenchLocale.getDisplayCountry());
		System.out.println("Date: "+frenchDate);		
		System.out.println("Time: "+frechTime);
	}

}