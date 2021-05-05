package hw2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(2,"Engin","Demiroð","12345678901", LocalDate.of(1980, 3, 1));
		Customer customer2 = new Customer(3,"Pınar","Bedir","12345678902", LocalDate.of(1998, 7, 1));

		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		
		BaseCustomerManager starbucksCustomerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer2);

	}

}
