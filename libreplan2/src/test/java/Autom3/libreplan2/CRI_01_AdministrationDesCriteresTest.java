
package Autom3.libreplan2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRI_01_AdministrationDesCriteresTest {
	WebDriver driver;
	
	@Test
	public void  libreplanTest() throws Exception {
		System.out.println("Pas de test 1 - Connexion---------------------------------------------------");
		
		//Connexion à l'application
		ConnexionTest pou = new ConnexionTest();
		//Accession à la page calender
		CalendarPage calendar = pou.libreplanTest();
		//Vérification de la page calendar
		calendar.assertCalendrier();
		
		System.out.println("Pas de test 2 - Accès à la page d'administration des critères---------------");

		//Accès à la liste des types de critères
		RessourcesPage ressource = calendar.ressourceOngletCritere();
		
		System.out.println("Pas de test 3 - Créer un critère - Accès au formulaire----------------------");
		//Cliquer sur le bouton de création d'un critère
		CreerTypeCriterePage creertype = ressource.clickButtonCreer();
		
		System.out.println("Pas de test 4 - 5 - 6 - 7 - Créer un critère - Remplir le formulaire--------");

		creertype.remplirFormulaire();
	//	creertype.assertAjoutMessage();
		
		System.out.println("Pas de test 8 - cliquer sur le bouton annuler ------------------------------");

		RessourcesPage ressource_2 = creertype.boutonAnnulerTypeCritere();
		
		
		System.out.println("Pas de test 9 - cliquer sur le bouton modifier -----------------------------");

		CreerTypeCriterePage creertype2 = ressource_2.clickBoutonModifierCritere();
		creertype2.assertTitleCritere();
		
		System.out.println("Pas de test 10 - modifier un critère - bouton annuler ----------------------");
		
		creertype2.clearName();
		creertype2.changeName("Critère - Test bouton - 2");
		RessourcesPage ressource_3 = creertype2.boutonAnnulerTypeCritere();
		
		ressource_3.assertTitle();
		
		
	}
	
}