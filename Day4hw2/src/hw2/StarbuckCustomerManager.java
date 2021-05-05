package hw2;

public class StarbuckCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;

	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Starbucks Manager : Validation successfull.");
			super.save(customer);
		}else {
			System.out.println("Starbucks Manager : Not a valid person.");
		}
		
	}
	

}
