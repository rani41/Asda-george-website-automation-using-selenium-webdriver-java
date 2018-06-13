package asdageorge.asdageorge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class kidsorder {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\sandhya\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://direct.asda.com");
	driver.manage().window().maximize();
	WebElement element = driver.findElement(By.cssSelector("a#tablink_D25"));
	element.click();
	driver.close();
	
}
}
