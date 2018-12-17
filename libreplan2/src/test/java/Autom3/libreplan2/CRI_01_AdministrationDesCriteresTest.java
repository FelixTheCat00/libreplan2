
package Autom3.libreplan2;

import java.beans.EventHandler;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;
import BDD.JDBC;
import Outils.Highlighter;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.postgresql.core.ConnectionFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import BDD.JDBC;

//@Listeners(TestNGListener.class)
public class CRI_01_AdministrationDesCriteresTest  {
	WebDriver driver;
	JDBC datata = new JDBC();

	@Test
	public void  libreplanTest() throws Exception {
	 
		System.out.println("Pas de test 1 - Connexion");

		//Connexion à l'application
		ConnexionTest pou = new ConnexionTest();
		//Accession à la page calender
		CalendarPage calendar = pou.libreplanTest();
		
		
	
		
		//Vérification de la page calendar
		calendar.assertCalendrier();

		System.out.println("Pas de test 2 - Accès à la page d'administration des critères");

		//Accès à la liste des types de critères
		TypeCritereListPage tclp = calendar.ressourceOngletCritere();
		tclp.assertTypeCritereListePage();


		System.out.println("Pas de test 3 - Créer un critère - Accès au formulaire");
		//Cliquer sur le bouton de création d'un critère
		CreerTypeCriterePage creertype = tclp.clickButtonCreer();
		creertype.assertCreerTypeCriterePage();

		System.out.println("Pas de test 4 - Créer un critère - Annuler ");

		TypeCritereListPage tcl = creertype.remplirFormulaireAnnulation();
		tcl.assertTitle();
		tcl.assertFalseBoutonAnnuler();
		
		System.out.println("Pas de test 5 - Créer un critère - Enregistrer ");

		CreerTypeCriterePage creetype1 = tcl.clickButtonCreer();
		TypeCritereListPage tcl1 = creetype1.remplirFormulaireEnregister();

		tcl1.assertTitle();
		tcl1.assertCritereTestBoutonTableau();
		System.out.println("Pas de test 6 - Créer un critère - Accès au formulaire");

		
		CreerTypeCriterePage creetype2 = tcl1.clickButtonCreer();
		creetype2.assertCreerTypeCriterePage();
		System.out.println("Pas de test 7 - Créer un critère - Sauver et continuer");
		// Il faudra supprimer ou effectuer cette méthode
		datata.deleteCritere();
		creetype2.remplirFormulaireSauverContinuer();
		creetype2.assertAjoutMessage();
		System.out.println("Pas de test 8 - cliquer sur le bouton annuler ");

		TypeCritereListPage ressource_2 = creertype.boutonAnnulerTypeCritere();

		ressource_2.assertTitle();
		ressource_2.assertCritereTestBoutonTableau();

		System.out.println("Pas de test 9 - cliquer sur le bouton modifier");

		CreerTypeCriterePage creertype2 = ressource_2.clickBoutonModifierCritere();
		creertype2.assertTitleCritere();

		System.out.println("Pas de test 10 - modifier un critère - bouton annuler ");

		creertype2.changeName("Critère - Test bouton - 2");
		TypeCritereListPage tcl3 = creertype2.boutonAnnulerTypeCritere();
		tcl3.assertTitle();
		tcl3.assertNonModification();

		System.out.println("Pas de test 11 - modifier un critère - accès formulaire de modification colonne nom");

		CreerTypeCriterePage creertype3 = tcl3.choisirDeuxiemeCritereListe();

		creertype3.assertTitleCritere();
		System.out.println("Pas de test 12 - modifier un critère - modification du nom");

		creertype3.modifierChampNom("Critères - Test bouton 2");
		creertype3.assertModifierEnregistrementTitreCritere2();

		System.out.println("Pas de test 13 - modifier un critère - modification du nom");

		creertype3.clickSauverContinuer();
		creertype3.assertEnregistrementCritere2();
		creertype3.assertModifierEnregistrementTitreCritere2();

		System.out.println("Pas de test 14 - Retour page d'administration des critères ");
		TypeCritereListPage tcl4 = creertype3.boutonAnnulerTypeCritere();
		tcl4.assertTitle();
		tcl4.assertCritereTestBoutonTableau2();
		
		System.out.println("Pas de test 15 - Supprimer un critère - Pop-up de confirmation");
		tcl4.clickSuppressionCritere2();
		tcl4.assertPopUpConfirmation2();
		System.out.println("Pas de test 16 - Supprimer un critère - Bouton[Annuler]");
		tcl4.clickPopUpAnnuler();
		tcl4.assertCritereTestBoutonTableau2();

		System.out.println("Pas de test 17 - Supprimer un critère - Pop up de confirmation");
		tcl4.clickSuppressionCritere2();
		tcl4.assertPopUpConfirmation2();
		
		System.out.println("Pas de test 18 - Supprimer un critère - Bouton[OK]");
		tcl4.clickPopUpOK();
		tcl4.assertConfirmationSuppressionCritere2();	

		
	}	
	
	
}