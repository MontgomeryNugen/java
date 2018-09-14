import java.util.Arrays;

public class StudentScoresApp {

	public static void main(String[] args) {

		System.out.println("The Student Scores Application\n");

		int n = Console.getInt("Number of Students: ", 0, Integer.MAX_VALUE);
		Student[] students = new Student[n];
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("STUDENT " + (i + 1));
			String lname = Console.getString("Last Name: ");
			String fname = Console.getString("First Name: ");
			int s = Console.getInt("Score: ", -1, 101);
			Student student = new Student(fname, lname, s);
			students[i] = student;
			System.out.println();
		}
		System.out.println();
		Arrays.sort(students);

		System.out.println("SUMMARY");
		for (Student s : students) {
			System.out.println(s);
		}

		System.out.println("Goodbye!");
	}

}
