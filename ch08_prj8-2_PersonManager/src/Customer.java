
public class Customer extends Person {

	private String customerNumber;

	public Customer(String first, String last, String number) {
		super(first, last);
		this.customerNumber = number;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Customer Number: " + getCustomerNumber() + "\n";
	}

}
