
public class Employee extends Person {

	private String ssn;

	public Employee(String first, String last, String ssn) {
		super(first, last);
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "SSN: " + "XXX-XX-" + ssn.substring(7);
	}

}
