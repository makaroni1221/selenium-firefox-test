import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SampleScript {
	
	public static void main(String[] args){
		//System.setProperty("webdriver.chrome.driver", "/Users/manabehideyuki/Downloads/chromedriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://example.selenium.jp/reserveApp");
		driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
		driver.findElement(By.id("goto_next")).click();
		driver.quit();
	}

}
