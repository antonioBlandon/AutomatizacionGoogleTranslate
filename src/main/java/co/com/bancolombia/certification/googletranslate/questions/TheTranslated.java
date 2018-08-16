package co.com.bancolombia.certification.googletranslate.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static co.com.bancolombia.certification.googletranslate.userinterfaces.GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA;

@Subject("the translated text")
public class TheTranslated implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return TARGET_LANGUAGE_TEXT_AREA.resolveFor(actor).getText();
	}

	public static TheTranslated text() {
		return new TheTranslated();
	}

}
