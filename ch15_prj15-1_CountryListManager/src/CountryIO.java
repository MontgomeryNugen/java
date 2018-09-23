import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountryIO {

	private List<Country> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;

	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getAll();
	}

	public List<String> getAll() {
		if (countries != null) {
			return countries;
		} else {
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
					String country = in.readLine();
					while (country != null) {
						countries.add(country);
						country = in.readLine();
					}
				} catch (IOException ioe) {
					System.out.println(ioe);
					return null;
				}
				return countries;
			} else {
				System.out.println(countriesPath.toAbsolutePath() + " doesn't exist.");
				return null;
			}
		}

	}

	public boolean saveAll() {

	}
}
