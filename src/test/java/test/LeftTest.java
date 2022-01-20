package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeftTest {
	private static WebDriver driver;

	public void OpenChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
	}

	public void ScrollDiv() {
		WebElement scroll = driver.findElement(By.xpath("//input[@type='submit'][@value='Login']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-890)");
	}

	public void Alert() {
		driver.findElement(By.xpath("//button[@onclick='alertfunction()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void TooltipOption() {
		Actions actions = new Actions(driver);
		WebElement tooltipOption = driver.findElement(By.xpath("//div[@class='tooltip']"));
		actions.moveToElement(tooltipOption).perform();
		String tooltipText = tooltipOption.getText();
		System.out.println("tooltipText--->" + tooltipText);
	}

	public void DoubleClick() {
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleClick).perform();
	}

//	public void DragAndDrop() {
//		WebElement from = driver.findElement(By.xpath("//img[@id='drag1']"));
//		WebElement to = driver.findElement(By.xpath("//div[@id='div1']"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDrop(from, to);
//		actions.perform();
//	}

	public void SampleLoginPage() {
		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@id='uname']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='text'][@id='pwd']"));
		username.sendKeys("test");
		password.sendKeys("test");
	}

	public void LoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
	}

	public void TearDownTest() {
		driver.close();
		driver.quit();

		System.out.println("Test Completed Sccessfully!");
	}
}
