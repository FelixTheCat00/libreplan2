package Autom3.libreplan2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPage extends GenericPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Calendrier')]")
	WebElement onglet_calendrier;
	public CalendarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

			
		public void assertCalendrier() throws InterruptedException {	
			Assert.assertTrue("Présence de l'onglet Calendrier", onglet_calendrier.isDisplayed());
		}
}
