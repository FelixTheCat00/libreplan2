package Autom3.libreplan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class GenericPage {

	protected final WebDriver driver;

	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	String utilisateur_login = "admin";
	String mot_de_passe_login = "admin";

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

	//Onglet Ressource
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Ressources')]")
	WebElement onglet_ressources;
	
	//Onglet Ressource
	@FindBy(how = How.XPATH, using ="(//a[contains(text(),'Critère')])[1]")
	WebElement onglet_ressources_critere;
	
	//Onglet Calendrier
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Calendrier')]")
	WebElement onglet_calendrier;
	
	public TypeCritereListPage ressourceOngletCritere() {

			Actions actions = new Actions(driver);
			actions.moveToElement(onglet_ressources).build().perform();
			driver.findElement(By.xpath("(//a[contains(text(),'Critère')])[1]")).click();
			return PageFactory.initElements(driver, TypeCritereListPage.class);

		}
	 




}
