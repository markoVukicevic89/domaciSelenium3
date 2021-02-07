package objcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pesma2 {
	public static final String URL = "https://www.youtube.com/watch?v=yPYZpwSpKmA";
	private static final String SONG_XPATH = "//*[@id=\"video-title\"]";
	
	public static void playSong2(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SONG_XPATH));
		we.click();
	}
}
