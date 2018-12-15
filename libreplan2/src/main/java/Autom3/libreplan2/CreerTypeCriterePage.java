package Autom3.libreplan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class CreerTypeCriterePage extends RessourcesPage {

	//Champ du nom
	@FindBy(how = How.XPATH, using ="//span[@class=\"z-label\" and contains(.,'Nom')]/following::input[@class='z-textbox'][1]")
	WebElement champ_nom;

	//Type de critère menu déroulant
	@FindBy(how = How.XPATH, using ="//td[@class='z-comboitem-text' and contains(.,'PARTICIPANT')]")
	WebElement type_critere_participant;

	//Type de critère bouton menu déroulant
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

	//Bouton annuler
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Annuler')]")
	WebElement bouton_annuler;	

	//Champ titre
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Modifier')]")
	WebElement title_field;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Test bouton 2')]")
	WebElement title_suppression_critere_2;
	
	@FindBy(how = How.XPATH, using ="//td[@class='z-button-cm' and contains(.,'Enregistrer')]")
	WebElement enregistrer;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Test bouton 2')]")
	WebElement champ_confirmation_enregistrement_critere_2;

	@FindBy(how = How.XPATH, using ="//td[contains(text(),'Modifier Type')]")
	WebElement titre_modifier_enregistrement_critere_2;
	





	public CreerTypeCriterePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public TypeCritereListPage remplirFormulaireAnnulation() throws Exception {
		this.clearName();
		this.changeName("Critère - Test bouton");
		this.btn_type_critere_participant.click();
		this.type_critere_participant.click();
		this.valeurMultipleBox();
		this.hierarchieBox();
		this.activeBox();
		this.description_field.sendKeys("Critère - Test bouton");
		this.boutonAnnulerTypeCritere();
		return PageFactory.initElements(driver, TypeCritereListPage.class);
	}

	public void remplirFormulaireSauverContinuer() throws InterruptedException {
		this.clearName();
		this.changeName("Critère - Test bouton");
		this.choixDuTypeParticipant();
		this.valeurMultipleBox();
		this.hierarchieBox();
		this.activeBox();
		this.description_field.sendKeys("Critère - Test bouton");
		this.clickSauverContinuer();
		
	}
	
	public TypeCritereListPage remplirFormulaireEnregister() {
		this.clearName();
		this.changeName("Critère - Test bouton");
		this.btn_type_critere_participant.click();
		this.type_critere_participant.click();
		this.valeurMultipleBox();
		this.hierarchieBox();
		this.activeBox();
		this.description_field.sendKeys("Critère - Test bouton");
		this.clickEnregistrer();
		return PageFactory.initElements(driver, TypeCritereListPage.class);
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

	public void clearName() {
		this.champ_nom.clear();
	}
	public void changeName(String s) {
		if (s.equals(null)) {
			this.champ_nom.sendKeys("Critère - Test bouton -"+3);
		} else {
			this.champ_nom.sendKeys(s);
		}
	}

	public TypeCritereListPage boutonAnnulerTypeCritere() throws Exception {
		Thread.sleep(2000);
		this.bouton_annuler.click();

		return PageFactory.initElements(driver, TypeCritereListPage.class);
	}

	public void assertTitleCritere() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Vérification de la présence du titre",this.title_field.getText().equals("Modifier Type de critère: Critère - Test bouton"));
	}
	
	public void modifierChampNom(String s) {
		this.champ_nom.clear();
		this.champ_nom.sendKeys(s);
	}
	
	public void assertTitleSuppressionCritere2() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(this.titre_type_de_criteres2.isDisplayed());
	}
	
	public TypeCritereListPage clickEnregistrer() {
		this.enregistrer.click();
		return PageFactory.initElements(driver, TypeCritereListPage.class);

	}
	
	public void choixDuTypeParticipant() throws InterruptedException {
		Thread.sleep(2000);
		btn_type_critere_participant.click();
		type_critere_participant.click();
	}
	
	public void assertEnregistrementCritere2() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Vérification de l'enregistrement du titre",this.champ_confirmation_enregistrement_critere_2.getText().equals("Type de critère \"Critères - Test bouton 2\" enregistré"));
	}
	
	public void assertModifierEnregistrementTitreCritere2() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue("Vérification de l'enregistrement du titre",this.titre_modifier_enregistrement_critere_2.getText().equals("Modifier Type de critère: Critères - Test bouton 2"));
	}
	

	
}
