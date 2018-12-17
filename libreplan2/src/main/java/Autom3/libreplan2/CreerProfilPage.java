package Autom3.libreplan2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreerProfilPage extends ConfigurationPage {

	//Champ nom
	@FindBy(how = How.XPATH, using ="//input[@class='focus-element z-textbox z-textbox-text-invalid']")
	WebElement name_field;
	
	//Bouton enregistrer
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Enregistrer')]")
	WebElement bouton_enregistrer;
	
	//Bouton sauver et continuer
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Sauver et continuer')]")
	WebElement bouton_sauver_continuer;
	
	//Bouton annuler
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Annuler')]")
	WebElement bouton_annuler;
	public CreerProfilPage(WebDriver driver) {
		super(driver);
	}

	public void assertNameFieldEmpty() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Vérification du titre", this.name_field.getText().isEmpty());
		Assert.assertTrue("Vérification du bouton enregistrer", this.bouton_enregistrer.isEnabled());
		Assert.assertTrue("Vérification du bouton sauver et continuer", this.bouton_sauver_continuer.isDisplayed());
		Assert.assertTrue("Vérification du bouton annuler", this.bouton_annuler.isDisplayed());
	}
}
