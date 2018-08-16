package co.com.bancolombia.certification.googletranslate.model;

public class WordTranslate {
	
	private final String word;
	private final String from;
	private final String to;
	
	public WordTranslate(String word, String from, String to) {
		this.word = word;
		this.from = from;
		this.to = to;
	}

	public String getWord() {
		return word;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}
	
}
