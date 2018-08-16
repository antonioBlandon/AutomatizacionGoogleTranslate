package co.com.bancolombia.certification.googletranslate.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://translate.google.com/")
public class GoogleTranslatePage extends PageObject {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source Language Button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target Language Button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source language text area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target language text area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate Button").located(By.id("gt-submit"));
	
	public static final Target FROM_LANGUAGE = Target.the("Source Language").locatedBy("//div[@id='gt-sl-gms-menu']/table/tbody/tr/td//div[contains(text(), '{0}')]");
	public static final Target TO_LANGUAGE = Target.the("Target Language").locatedBy("//div[@id='gt-tl-gms-menu']/table/tbody/tr/td//div[contains(text(), '{0}')]");

}
