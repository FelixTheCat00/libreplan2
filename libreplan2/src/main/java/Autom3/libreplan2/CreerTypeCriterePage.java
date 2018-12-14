package Autom3.libreplan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.junit.Assert;

public class CreerTypeCriterePage extends RessourcesPage {

	//Champ du nom
	@FindBy(how = How.XPATH, using ="//span[@class=\"z-label\" and contains(.,'Nom')]/following::input[@class='z-textbox'][1]")
	WebElement champ_nom;

	//Type de critère menu déroulant
	@FindBy(how = How.XPATH, using ="//td[@class='z-comboitem-text' and contains(.,'PARTICIPANT')]")
	WebElement type_critere_participant;

	//Type de critère menu déroulant
	@FindBy(how = How.XPATH, using ="//i[@class='z-combobox-btn']")
	WebElement btn_type_critere_participant;

	//Bouton valeur multiple
	@FindBy(how = How.XPATH, using ="//span[contains(.,'Valeurs multiples par ressource')]/following::input[@type='checkbox'][1]")
	WebElement valeur_multiple;

	//boutojn hierarchie
	@FindBy(how = How.XPATH, using ="//span[contains(.,'Hiérarchie')]/following::input[@type='checkbox'][1]")
	WebElement hierarchie_box;

	//Bouton active 
	@FindBy(how = How.XPATH, using ="//span[contains(.,'Activé')]/following::input[@type='checkbox'][1]")
	WebElement active_box;

	//Champ description
	@FindBy(how = How.XPATH, using ="//textarea[@class='z-textbox']")
	WebElement description_field;

	//Bouton sauver et continuer
	@FindBy(how = How.XPATH, using ="//td[@class='z-button-cm' and contains(.,'Sauver et continuer')]")
	WebElement btn_sauver_continuer;

	//Bouton sauver et continuer
	@FindBy(how = How.XPATH, using ="//div[@class='message_INFO']")
	WebElement message_confirmation_ajout;
	
	public CreerTypeCriterePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void remplirFormulaire() {
		this.champ_nom.clear();
		this.champ_nom.sendKeys("Critère - Test bouton - 1");
		this.btn_type_critere_participant.click();
		this.type_critere_participant.click();
		this.valeurMultipleBox();
		this.hierarchieBox();
		this.activeBox();
		this.description_field.sendKeys("Critère - Test bouton");
		this.clickSauverContinuer();
		this.assertAjoutMessage();
	}

	
	/*Méthode pour cocher la checkbox valeur multiples
	 * */
	public void valeurMultipleBox() {
		if(this.valeur_multiple.isSelected()) {

		}else {
			this.valeur_multiple.clear();
		}
	}

	/*Méthode pour cocher la checkbox hierarchie
	 * */
	public void hierarchieBox() {
		if(this.hierarchie_box.isSelected()) {

		}else {
			this.hierarchie_box.clear();
		}
	}
	
	/*Méthode pour cocher la checkbox active
	 * */
	public void activeBox() {
		if(this.active_box.isSelected()) {

		}else {
			this.active_box.clear();
		}
	}
	
	public void clickSauverContinuer(){
		this.btn_sauver_continuer.click();
	}
	
	public void assertAjoutMessage() {
		Assert.assertTrue(message_confirmation_ajout.isDisplayed());
	}
}
