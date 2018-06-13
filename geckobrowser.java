package asdageorge.asdageorge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class geckobrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\sandhya\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://direct.asda.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		

	}

}
