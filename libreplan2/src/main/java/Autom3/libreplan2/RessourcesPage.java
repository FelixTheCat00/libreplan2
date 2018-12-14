package Autom3.libreplan2;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RessourcesPage extends GenericPage {

	//Bouton creer ressource
	@FindBy(how = How.XPATH, using ="//table/descendant::td[contains(.,'Créer')]")
	WebElement button_creer_ressources;
	
	//Bouton modifier
	@FindBy(how = How.XPATH, using ="(//span[@title='Modifier'])[2]")
	WebElement critere_test_bouton_modifier;
	
	//Titre Types de critères liste
	@FindBy(how = How.XPATH, using ="//div[contains(text(),'Types de')]")
	WebElement titre_type_de_criteres;

	public RessourcesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public CreerTypeCriterePage clickButtonCreer() throws InterruptedException {
		button_creer_ressources.click();
		return PageFactory.initElements(driver, CreerTypeCriterePage.class);
	}
	
	public CreerTypeCriterePage clickBoutonModifierCritere() throws InterruptedException {
		Thread.sleep(5000);
		this.critere_test_bouton_modifier.click();
		return PageFactory.initElements(driver, CreerTypeCriterePage.class);
	}
	
	public void assertTitle() {
		System.out.println("Titre : " +  this.titre_type_de_criteres.getText());
		Assert.assertTrue("Vérification du titre", this.titre_type_de_criteres.getText().equals("Types de critères Liste"));
	}

}
