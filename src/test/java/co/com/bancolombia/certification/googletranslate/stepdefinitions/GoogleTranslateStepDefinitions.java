package co.com.bancolombia.certification.googletranslate.stepdefinitions;

import static co.com.bancolombia.certification.googletranslate.model.WordTranslateBuilder.word;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googletranslate.questions.TheTranslated;
import co.com.bancolombia.certification.googletranslate.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googletranslate.tasks.Translate;
import co.com.bancolombia.certification.googletranslate.userinterfaces.GoogleTranslatePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor antonio = Actor.named("Antonio");
	
	private GoogleTranslatePage googleTranslatePage;
	
	@Before
	public void setUp() {
		antonio.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Antonio wants to translate a word$")
	public void thatAntonioWantsToTranslateAWord() {
		antonio.wasAbleTo(OpenTheBrowser.on(googleTranslatePage));
	}

	@When("^he translates the word (.*) from (.*) to (.*)$")
	public void heTranslatesTheWordCheeseFromEnglishToSpanish(String word, String sourceLanguage, String targetLanguage) {
		antonio.wasAbleTo(
				Translate.the(word(word).from(sourceLanguage).to(targetLanguage))
				);
		
	}

	@Then("^he should see the word (.*) in the screen$")
	public void heShouldSeeTheWordQuesoInTheScreen(String wordTranslated) {
		antonio.should(seeThat(TheTranslated.text(), is(wordTranslated)));
	}

}
