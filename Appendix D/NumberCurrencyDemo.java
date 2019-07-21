import java.text.NumberFormat;
import java.util.Locale;

public class NumberCurrencyDemo {
	
	public static void main(String[] args) {
		
		String language;
		String country;
		Double amount = new Double(648927.843);
		Double currency=new Double(3866249.21);
		if (args.length != 2) {

	          language = new String("en");
	          country = new String("US");

		} else {

	          language = new String(args[0]);
	          country = new String(args[1]);

	      	}
		Locale locale=new Locale(language, country);
			
		NumberFormat formatter = NumberFormat.getNumberInstance(locale);
		NumberFormat formatter1=NumberFormat.getCurrencyInstance(locale);
		
		String amountStr = formatter.format(amount);
		String currencyStr=formatter1.format(currency);
		
		System.out.println(locale.getDisplayCountry());
		System.out.println("Number: "+amountStr);
		System.out.println("Currency: "+currencyStr);	
		
	}
	
}