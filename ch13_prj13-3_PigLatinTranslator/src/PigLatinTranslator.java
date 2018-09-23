
public class PigLatinTranslator {

	private String englishInput;
	private String[] words;
	private String pigLatinOutput;

	public PigLatinTranslator(String englishInput) {
		this.englishInput = englishInput;
	}

	public String getEnglishInput() {
		return englishInput;
	}

	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getPigLatinOutput() {
		return pigLatinOutput;
	}

	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}

	public String translate() {
		convertToLowercase();
		parseStringToArray();
		removePunctuation();
		
		// words is now 'clean' and ready for translation		
		
		for (String s : words) {
			
		}
		
		
		return pigLatinOutput;
	}
	
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	
	private void removePunctuation() {
		for (String s : words) {
			// remove ',' '.' '!' and '?' from end of each word
			if (s.endsWith("'") || s.endsWith("!") || s.endsWith(".") || s.endsWith("?")) {
				s.replace("'", " ");
			}
		}
	}
	
}
