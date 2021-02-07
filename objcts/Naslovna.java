package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Naslovna {
	public static final String URL = "https://www.youtube.com/";
	private static final String SRCH_XPATH = "//*[@id=\"search\"]";
	private static final String BTN_XPATH = "//*[@id=\"search-icon-legacy\"]";
	
	public static void typeSong(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SRCH_XPATH));
		we.click();
		we.sendKeys("Rick Astley Never gonna give you up");
	}
	public static void pressSearch(WebDriver driver) {
		driver.findElement(By.xpath(BTN_XPATH)).click();
	}
}
