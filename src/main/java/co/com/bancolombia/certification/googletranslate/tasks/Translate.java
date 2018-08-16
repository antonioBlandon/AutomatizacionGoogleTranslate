package co.com.bancolombia.certification.googletranslate.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.bancolombia.certification.googletranslate.userinterfaces.GoogleTranslatePage.*;

import co.com.bancolombia.certification.googletranslate.model.WordTranslate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task {
	
	private final WordTranslate wordTranslate;
	
	public Translate(WordTranslate wordTranslate) {
		this.wordTranslate = wordTranslate;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SOURCE_LANGUAGE_OPTION), 
				Click.on(FROM_LANGUAGE.of(wordTranslate.getFrom())),  
				Click.on(TARGET_LANGUAGE_OPTION), 
				Click.on(TO_LANGUAGE.of(wordTranslate.getTo())),  
				Enter.theValue(wordTranslate.getWord()).into(SOURCE_LANGUAGE_TEXT_AREA),
				Click.on(TRANSLATE_BUTTON)
		);
	}

	public static Translate the(WordTranslate wordTranslate) {
		return instrumented(Translate.class, wordTranslate);
	}

}