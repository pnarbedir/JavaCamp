package hw2;

public class BaseCustomerManager implements CustomerService {
		@Override
		public  void save(Customer customer) {
			System.out.println(customer.getFirstName() + " is saved to db");
		}

	}

