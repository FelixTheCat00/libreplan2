package Autom3.libreplan2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GUP_01_GestionDunProfilTest {

	@Test
	public void test() throws InterruptedException {
		System.out.println("Pas de test 1 - Connexion");
		//Connexion à l'application
		ConnexionTest pou = new ConnexionTest();
		//Accession à la page calender
		CalendarPage calendar = pou.libreplanTest();
		//Vérification de la page calendar
		calendar.assertCalendrier();
		System.out.println("Pas de test 2 - Accéder à la page de gestion des profils");

		ProfilsPage profil = calendar.configurationOngletProfils();	
		profil.assertProfilPage();
		
		System.out.println("Pas de test 3 - Créer un profil - Accès au formulaire de création");

		CreerProfilPage creerprofil = profil.clickBoutonCreer();
		creerprofil.assertNameFieldEmpty();
	}

}
