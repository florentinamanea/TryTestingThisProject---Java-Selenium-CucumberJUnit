package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightTest {
	private static WebDriver driver;

	public void OpenChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
	}

	public void ScrollPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,950)");
		Form();
	}

	public void Form() {
		WebElement firstName = driver.findElement(By.id("fname"));
		WebElement lastName = driver.findElement(By.id("lname"));
		firstName.sendKeys("Manea");
		lastName.sendKeys("Florentina");

		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
	}

	public void SelectOption() {
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByValue("option 2");
		Actions actions = new Actions(driver);
		actions.clickAndHold();

		List<WebElement> options = driver.findElements(By.xpath("//select[@id='owc']/option"));
		options.get(0).click();
		options.get(1).click();

		List<WebElement> selectCheckbox = driver.findElements(By.xpath("//input[@type='checkbox'][@id='moption']"));
		for (WebElement select : selectCheckbox) {
			select.click();
		}
	}

	public void TypingAndSelect() {
		WebElement typing = driver.findElement(By.xpath("//input[@list='datalists'][@name='Options']"));
		typing.sendKeys("Banana");
		typing.click();
	}

	public void SelectColor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('favcolor').setAttribute('value','#FF0000')");
	}

	public void SelectDate() {
		WebElement selectDate = driver.findElement(By.id("day"));
		selectDate.sendKeys("12/12/2012");
	}

	public void RangeSlider() {
		WebElement rangeSlider = driver.findElement(By.id("a"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(rangeSlider, -50, 0).perform();
		actions.dragAndDropBy(rangeSlider, 50, 100).perform();
	}

	public void ChooseFile() {
		Actions actions = new Actions(driver);
		WebElement uploadElement = driver.findElement(By.id("myfile"));
		actions.moveToElement(uploadElement).perform();
		uploadElement.sendKeys("C:\\Users\\Florentina\\Desktop\\testS.txt");
	}

	public void QuantityRange() {
		WebElement quantityRange = driver.findElement(By.id("quantity"));
		quantityRange.sendKeys("1");
	}

	public void LongMessage() {
		WebElement longMessage = driver.findElement(By.xpath("//textarea[@name='message']"));
		longMessage.clear();
		longMessage.sendKeys(
				"Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.");
	}

	public void SubmitButton() {
		WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		submitButton.click();
	}

	public void CloseTab() {
		ArrayList<String> switchTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchTabs.get(1));
		driver.close();
		driver.switchTo().window(switchTabs.get(0));
	}

	public void TearDownTest() {
		driver.close();
		driver.quit();

		System.out.println("Test Completed Sccessfully!");
	}
}
