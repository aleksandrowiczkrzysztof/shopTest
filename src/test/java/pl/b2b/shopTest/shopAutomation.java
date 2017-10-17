package pl.b2b.shopTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class shopAutomation {
	private WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}

/*	@Test
	public void sprawdzCzyPoKlikieniuLogowaniaNastapiloPrawidlowePrzekierowanie() {

		UtilsAutomation.kliniecielogowania(driver);
		assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",
				driver.getCurrentUrl());
		// http://automationpractice.com/index.php?controller=authentication&back=my-account
	}

	@Test
	public void czyPoKliknieciuContactUsNastapiloPrawidlowePrzekierowanie() {

		WebElement element = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
		element.click();
		assertEquals("http://automationpractice.com/index.php?controller=contact", driver.getCurrentUrl());
	}

	@Test
	public void czyMoznaSieZalogowac() {
		UtilsAutomation.logowanie(driver);
	}

	@Test
	public void czyLogowanieWomen() {

		UtilsAutomation.logowanie(driver);
		UtilsAutomation.naWomen(driver);
		List<WebElement> wybor = UtilsAutomation.pobranieElementowKategorii(driver);
assertEquals(true,wybor.size() == 2);
	}
	
	@Test
	public void czyIloscWlasciwosciPoZalogowaniuSieIWybraniuSekcjiWomenWynosi5() {
		UtilsAutomation.logowanie(driver);
		UtilsAutomation.naWomen(driver);
		List<WebElement> wybor2 = UtilsAutomation.pobranieElementowProperties(driver);
		assertEquals(true,wybor2.size() == 5);
			}*/
	/*@Test
	public void czyWsrodRozmiarowJestL() {
		UtilsAutomation.logowanie(driver);
		UtilsAutomation.naWomen(driver);
		List<WebElement> wybor3 = UtilsAutomation.pobranieElementowSize(driver);
		boolean czyJestL = UtilsAutomation.czyWsrodElementowJestElementowOWlasciwosci(wybor3);
	
		assertEquals(true, czyJestL);
	}
	@Test
	public void czyDwaKolory() {
		UtilsAutomation.logowanie(driver);
		UtilsAutomation.naTShirt(driver);
		List<WebElement> wybor4 = UtilsAutomation.pobranieElementowKolor(driver);
		assertEquals(true,wybor4.size() == 2);
		
	} 
@Test
public void ilosckolorow() {
	UtilsAutomation.logowanie(driver);
	UtilsAutomation.naTShirt(driver);
	List<WebElement> kolorTShirt = UtilsAutomation.pobranieElementowKolor(driver);
	UtilsAutomation.naDresses(driver);
	List<WebElement> kolorDresses = UtilsAutomation.pobranieElementowKolor(driver);
	assertEquals(true,kolorTShirt.size()<kolorDresses.size());
} */
	@Test
	public void dodawanieDoKoszyka() {
		UtilsAutomation.logowanie(driver);
		UtilsAutomation.naDresses(driver);
		UtilsAutomation.naCasualDresses(driver);
		UtilsAutomation.naRedDresses(driver);
		UtilsAutomation.addToChart(driver);
		UtilsAutomation.przekierowanieDoKoszyka(driver);
		List<WebElement> wybor5 = UtilsAutomation.pobranieElementowKoszyk(driver);
		assertEquals(true,wybor5.size() == 1);
		
	}
	}
	// @After
	// public void close() {	// driver.quit();
	// }


