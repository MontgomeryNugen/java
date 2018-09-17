
public class Employee extends Person {

	private String ssn;

	public Employee(String first, String last, String ssn) {
		super(first, last);
	}

	public String getSsn() {
		//return "XXX-XX-" + ssn.substring(7);
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "SSN: " + "XXX-XX-" + getSsn();
	}

}
