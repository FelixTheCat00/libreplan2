package Autom3.libreplan2;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.platform.FileUtils;

import java.io.File;
import java.util.List;

import org.junit.Assert;

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

	//Liste des titres du tableau de la page des types de critères
	@FindBy(how = How.XPATH, using ="//div[@class='z-column-cnt' and contains(.,'Nom')]")
	WebElement table_titre_nom;

	@FindBy(how = How.XPATH, using ="//div[@class='z-column-cnt' and contains(.,'Code')]")
	WebElement table_titre_code;

	@FindBy(how = How.XPATH, using ="//div[@class='z-column-cnt' and contains(.,'Type')]")
	WebElement table_titre_type;

	@FindBy(how = How.XPATH, using ="//div[@class='z-column-cnt' and contains(.,'Activé')]")
	WebElement table_titre_active;

	@FindBy(how = How.XPATH, using ="//div[@class='z-column-cnt' and contains(.,'Opérations')]")
	WebElement table_titre_operations;




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

	public void assertTypeCritereListePage() throws Exception {
		try {
			Assert.assertTrue("Vérification présence bouton créer", this.button_creer_ressources.isDisplayed());
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(source, new File(".Screenshot/Assert.png"));
		} catch(AssertionError e) {
			System.out.println("La présence du bouton créer n'est pas vérifier");
			throw e;
		}

		try {
			Assert.assertTrue("Vérification présence bouton créer", this.table_titre_nom.getText().equals("Nom"));
		} catch(AssertionError e) {
			System.out.println("La présence du titre de la colonne \'Nom\' de la table n'est pas vérifiée");
			throw e;
		}

		try {
			Assert.assertTrue("Vérification présence bouton créer", this.table_titre_code.getText().equals("Code"));
		} catch(AssertionError e) {
			System.out.println("La présence du titre de la colonne \'Code\' de la table n'est pas vérifiée");
			throw e;
		}

		try {
			Assert.assertTrue("Vérification présence bouton créer", this.table_titre_type.getText().equals("Type"));
		}catch(AssertionError e) {
			System.out.println("La présence du titre de la colonne \'Type\' de la table n'est pas vérifiée");
			throw e;
		}

		try {
			Assert.assertTrue("Vérification présence bouton créer", this.table_titre_active.getText().equals("Activé"));
		}catch(AssertionError e) {
			System.out.println("La présence du titre de la colonne \'Activé\' de la table n'est pas vérifiée");
			throw e;
		}

		try {
			Assert.assertTrue("Vérification présence bouton créer", this.table_titre_operations.getText().equals("Opérations"));
		}catch(AssertionError e) {
			System.out.println("La présence du titre de la colonne \'Opérations\' de la table n'est pas vérifiée");
			throw e;
		}

	}


}
