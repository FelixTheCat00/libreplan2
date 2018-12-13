package Autom3.libreplan2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,  this);
		// TODO Auto-generated constructor stub
	}
	
	String utilisateur_login = "admin";
	String mot_de_passe_login = "admin";
	
	//champ pour le login utilisateur
	@FindBy(how = How.XPATH, using ="//input[@name=\"j_username\"]")
	WebElement utilisateur_field;
	
	//champ pour le mot de passe utilisateur
	@FindBy(how = How.XPATH, using ="//input[@name=\"j_password\"]")
	WebElement mot_de_passe_login_field;
	
	//le bouton pour se connecter � l'application
	@FindBy(how = How.XPATH, using ="//input[@name=\"button\"]")
	WebElement btn_se_connecter;


	//le lien pour l'aide
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Aide')]")
	WebElement aide_lien;
	

	public IndexPage clickSubmitButton() {
		utilisateur_field.clear();
		utilisateur_field.sendKeys(utilisateur_login);
		mot_de_passe_login_field.clear();
		mot_de_passe_login_field.sendKeys(mot_de_passe_login);
		btn_se_connecter.submit();
		return PageFactory.initElements(driver, IndexPage.class);
	}
	
}
