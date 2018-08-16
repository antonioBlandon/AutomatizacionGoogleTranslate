package co.com.bancolombia.certification.googletranslate.model;

public class WordTranslateBuilder {
	
	private String word;
	private String from;
	private String to;
		
	public WordTranslateBuilder(String word) {
		this.word = word;
	}

	public WordTranslateBuilder from(String from) {
		this.from = from;
		return this;
	}

	public WordTranslate to(String to) {
		this.to = to;
		return build();
	}
	
	public WordTranslate build() {
		return new WordTranslate(word, from, to);
	} 
	
	public static WordTranslateBuilder word(String word) {
		return new WordTranslateBuilder(word);
	}
	
}
