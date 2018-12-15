
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
		/*System.out.println("Pas de test 3 - Créer un critère - Accès au formulaire");
		//Cliquer sur le bouton de création d'un critère
		CreerTypeCriterePage creertype = tclp.clickButtonCreer();

		System.out.println("Pas de test 4 - Créer un critère - Annuler ");

		TypeCritereListPage tcl = creertype.remplirFormulaireAnnulation();

		System.out.println("Pas de test 5 - Créer un critère - Enregistrer ");

		CreerTypeCriterePage creetype1 = tcl.clickButtonCreer();
		TypeCritereListPage tcl1 = creetype1.remplirFormulaireEnregister();

		System.out.println("Pas de test 6 - Créer un critère - Accès au formulaire");

		CreerTypeCriterePage creetype2 = tcl1.clickButtonCreer();

		System.out.println("Pas de test 7 - Créer un critère - Sauver et continuer");
		// Il faudra supprimer effctuer cette méthode
		creetype2.remplirFormulaireSauverContinuer();

		System.out.println("Pas de test 8 - cliquer sur le bouton annuler ");

		TypeCritereListPage ressource_2 = creertype.boutonAnnulerTypeCritere();


		System.out.println("Pas de test 9 - cliquer sur le bouton modifier");

		CreerTypeCriterePage creertype2 = ressource_2.clickBoutonModifierCritere();
		creertype2.assertTitleCritere();

		System.out.println("Pas de test 10 - modifier un critère - bouton annuler ");

		creertype2.clearName();
		creertype2.changeName("Critère - Test bouton - 2");
		TypeCritereListPage tcl3 = creertype2.boutonAnnulerTypeCritere();
		
		System.out.println("Pas de test 11 - modifier un critère - accès formulaire de modification colonne nom");

		CreerTypeCriterePage creertype3 = tcl3.choisirDeuxiemeCritereListe();
		
		System.out.println("Pas de test 12 - modifier un critère - modification du nom");

		creertype3.modifierChampNom("Critères - Test bouton 2");

		
		System.out.println("Pas de test 13 - modifier un critère - modification du nom");

		creertype3.clickSauverContinuer();
		creertype3.assertEnregistrementCritere2();
		creertype3.assertModifierEnregistrementTitreCritere2();
		
		System.out.println("Pas de test 14 - Retour page d'administration des critères ");
		TypeCritereListPage tcl4 = creertype3.boutonAnnulerTypeCritere();
		
		System.out.println("Pas de test 15 - Supprimer un critère - Pop-up de confirmation");
		tcl4.clickSuppressionCritere2();
		
		System.out.println("Pas de test 16 - Supprimer un critère - Bouton[Annuler]");
		tcl4.clickPopUpAnnuler();
		
		System.out.println("Pas de test 17 - Supprimer un critère - Pop up de confirmation");
		tcl4.clickSuppressionCritere2();
		
		System.out.println("Pas de test 18 - Supprimer un critère - Bouton[OK]");
		tcl4.clickPopUpOK();
*/

	}
}