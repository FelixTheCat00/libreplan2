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
     
	public TypeCritereListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public CreerTypeCriterePage clickButtonCreer() throws InterruptedException {
		Thread.sleep(2000);
		button_creer_ressources.click();
		return PageFactory.initElements(driver, CreerTypeCriterePage.class);
	}
	

}
