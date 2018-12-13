package Autom3.libreplan2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GenericPage {
	
	protected final WebDriver driver;

	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
		//Champ d'indication de l'utilisateur connecté
		@FindBy(how = How.XPATH, using ="//td[contains(text(),'admin')]")
		WebElement utilisateur_indication;
		
		//Champ d'indication de l'utilisateur connecté
		@FindBy(how = How.XPATH, using ="//a[contains(text(),'Déconnexion')]")
		WebElement deconnexion_link;
		
		//Lien aide
		@FindBy(how = How.XPATH, using ="//span[contains(text(),'Aide')]")
		WebElement help_link;
	
		//Lien info
		@FindBy(how = How.XPATH, using ="(//img[@src=\"/libreplan/common/img/info.gif\" and @alt=\"Info\"])[1]")
		WebElement info_popup;
		
		//Lien modier le mot de passe
		@FindBy(how = How.XPATH, using ="//a[contains(text(),'modifier le mot de passe')]")
		WebElement modifier_mot_passe;
		

}
