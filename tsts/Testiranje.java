package tsts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objcts.Naslovna;
import objcts.Pesma;
import objcts.Pesma2;

public class Testiranje {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority = 1)
	public void testSearch() {
		driver.navigate().to("https://www.youtube.com/");
		
		Naslovna.typeSong(driver);
		Naslovna.pressSearch(driver);
		
		String current = driver.getCurrentUrl();
		String expected = Pesma.URL;
		
		Assert.assertEquals(current, expected);
}
	@Test(priority = 2)
	public void testPlay() {
		
		driver.navigate().to(Pesma.URL);
		
		Pesma.playSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=Yz9P4Lnulw0";
		
		Assert.assertEquals(current, expected);
	}
	@Test(priority = 3)
	public void testPlay2() {
		
		driver.navigate().to(Pesma2.URL);
		
		Pesma.playSong(driver);
		
		String current = driver.getCurrentUrl();
		String expected = "https://www.youtube.com/watch?v=yPYZpwSpKmA";
		
		Assert.assertEquals(current, expected);
}
}