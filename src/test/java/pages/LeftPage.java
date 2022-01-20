package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeftPage {
	WebDriver driver;

	public void OpenChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
	}

	public void PressAlertButton() {
		WebElement alert = driver.findElement(By.xpath("//button[@onclick='alertfunction()']"));
		alert.click();
	}
	
	public boolean ConfirmAlert() {

	    boolean presentFlag = false;

	    try {

	        // Check the presence of alert
	        Alert alert = driver.switchTo().alert();
	        // Alert present; set the flag
	        presentFlag = true;
	        // if present consume the alert
	        alert.accept();
	        //( Now, click on ok or cancel button )

	    } catch (NoAlertPresentException ex) {
	        // Alert not present
	        ex.printStackTrace();
	    }
	    return presentFlag;
	}
	
	public void Scroll() {
		WebElement scroll = driver.findElement(By.xpath("//input[@type='submit'][@value='Login']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-890)");
	}
//	----------------------------------------Login Page----------------------------------------
	
	public void SampleLoginPage() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@id='uname']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='text'][@id='pwd']"));
		username.sendKeys("test");
		password.sendKeys("test");
	}
	
	public void PressLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
	}
	
	
	public void TearDownTest() {
		driver.close();
		driver.quit();

		System.out.println("Test Completed Sccessfully!");
	}
	
	
}
