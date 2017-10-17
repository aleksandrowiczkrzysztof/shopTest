package pl.b2b.shopTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilsAutomation {

	public static void kliniecielogowania(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		element.click();
	}

	public static void logowanie(WebDriver driver) {
		kliniecielogowania(driver);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("b2bnetworkwarszawa@gmail.com");
		WebElement haslo = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		haslo.sendKeys("n3tw0rk2017");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		submit.click();
	}

	public static void naWomen(WebDriver driver) {
		WebElement woman = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		woman.click();
	}

	public static void naTShirt(WebDriver driver) {
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		tshirt.click();
	}

	public static void naDresses(WebDriver driver) {
		WebElement dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dresses.click();
	}

	public static void naCasualDresses(WebDriver driver) {
		WebElement casualDresses = driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a"));
		casualDresses.click();
	}

	public static void naRedDresses(WebDriver driver) {
		WebElement redDresses = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		redDresses.click();
	}
	public static void cancel(WebDriver driver) {
		WebElement cancel = driver
				.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
		cancel.click();
	}
	
	public static void addToChart(WebDriver driver) {
		WebElement addToChart = driver
				.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		addToChart.click();
	}

	public static List<WebElement> pobranieElementowKategorii(WebDriver driver) {
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_category_0\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}


	public static List<WebElement> pobranieElementowProperties(WebDriver driver) {
		WebElement propertis = driver.findElement(By.xpath("//*[@id=\"layered_form\"]/div/div[6]"));
		List<WebElement> wybor2 = propertis.findElements(By.tagName("li"));
		return wybor2;
	}
	public static List<WebElement> pobranieElementowKoszyk(WebDriver driver) {
		WebElement koszyk = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]/tbody"));
		List<WebElement> wybor5 = koszyk.findElements(By.tagName("tr"));
		return wybor5;
	}
	public static List<WebElement> pobranieElementowSize(WebDriver driver) {
		WebElement size = driver.findElement(By.xpath("//*[@id=\"layered_form\"]/div/div[2]"));
		List<WebElement> wybor3 = size.findElements(By.tagName("li"));
		return wybor3;
	}

	public static List<WebElement> pobranieElementowKolor(WebDriver driver) {
		WebElement size = driver.findElement(By.xpath("//*[@id=\"layered_form\"]/div/div[2]"));
		List<WebElement> wybor4 = size.findElements(By.tagName("li"));
		return wybor4;
	}
	public static void przekierowanieDoKoszyka(WebDriver driver) {
	driver.navigate().to("http://automationpractice.com/index.php?controller=order");
}
	public static boolean czyWsrodElementowJestElementowOWlasciwosci(List<WebElement> wybor3) {
		boolean czyJestL = false;
		for (WebElement element : wybor3) {
			if (element.getText().contains("L")) {
				czyJestL = true;
			}
		}
		return czyJestL;
	}
}
