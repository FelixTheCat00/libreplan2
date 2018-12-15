package Autom3.libreplan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TypeCritereListPage extends RessourcesPage {

	//Bouton creer ressource
	@FindBy(how = How.XPATH, using ="//table/descendant::td[contains(.,'Créer')]")
	WebElement button_creer_ressources;
     
	@FindBy(how = How.XPATH, using ="(//img[contains(@src,'borrar')])[2]")
	WebElement suppression_critere_2;
	
	@FindBy(how = How.XPATH, using ="(//td[contains(text(),'Annuler')])[2]")
	WebElement pop_up_bouton_annuler;
	
	@FindBy(how = How.XPATH, using ="//td[contains(text(),'OK')]")
	WebElement pop_up_bouton_ok;


	public TypeCritereListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public CreerTypeCriterePage clickButtonCreer() throws InterruptedException {
		Thread.sleep(2000);
		button_creer_ressources.click();
		return PageFactory.initElements(driver, CreerTypeCriterePage.class);
	}
	
	public void clickSuppressionCritere2() throws InterruptedException {
		Thread.sleep(2000);
		suppression_critere_2.click();
	}
	
	public void clickPopUpAnnuler() throws Exception {
		Thread.sleep(2000);
		pop_up_bouton_annuler.click();
	}
	
	public void clickPopUpOK() throws Exception {
		Thread.sleep(2000);
		pop_up_bouton_ok.click();
	}

}
