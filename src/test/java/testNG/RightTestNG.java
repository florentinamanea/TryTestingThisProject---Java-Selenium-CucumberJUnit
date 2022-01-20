package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.RightTest;

public class RightTestNG {
RightTest rightTest = new RightTest();
	
	@BeforeTest
	public void BeforeTest() {
		rightTest.OpenChromeDriver();
	}
	
	@Test
	public void Test() {

		rightTest.Form();
		rightTest.SelectOption();
		rightTest.ScrollPage();
		rightTest.TypingAndSelect();
		rightTest.SelectColor();
		rightTest.SelectDate();
		rightTest.RangeSlider();
		rightTest.ChooseFile();
		rightTest.QuantityRange();
		rightTest.LongMessage();
		rightTest.SubmitButton();
		rightTest.CloseTab();
	}
	
	@AfterTest
	public void AfterTest() {
		rightTest.TearDownTest();
	}
		
}
