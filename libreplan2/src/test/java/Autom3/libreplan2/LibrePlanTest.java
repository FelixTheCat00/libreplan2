
package Autom3.libreplan2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrePlanTest {
	WebDriver driver;

	@Test
	public void  libreplanTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8180/libreplan/common/layout/login.zul");
		
		//Agrandir la fenêtre
		driver.manage().window().maximize();
	
		//Création d'une instance de la classe LoginPage
		LoginPage logpage = new LoginPage(driver);
		
		//Wait pour être sûr de cliquer sur le bouton
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//cliquer sur le boutton se connecter de la page login
		logpage.clickSubmitButton();
	}
	
}