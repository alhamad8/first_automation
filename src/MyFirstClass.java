import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\web driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com");
		String myTitle=driver.getTitle();
		System.out.println(myTitle);
		List<WebElement> myOption = driver.findElements(By.tagName("a"));
		for(int i=0 ; i < myOption.size(); i++) {
			System.out.println(myOption.get(i).getText());
			
			
		}

	}

}
