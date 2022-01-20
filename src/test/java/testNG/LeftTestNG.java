package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.LeftTest;

public class LeftTestNG {
	LeftTest leftTest = new LeftTest();

	@BeforeTest
	public void BeforeTest() {
		leftTest.OpenChromeDriver();
	}

	@Test
	public void Test() {
		leftTest.Alert();
		leftTest.TooltipOption();
		leftTest.DoubleClick();
		leftTest.ScrollDiv();

//		leftTest.DragAndDrop();

		leftTest.SampleLoginPage();
		leftTest.LoginButton();
	}

	@AfterTest
	public void AfterTest() {
		leftTest.TearDownTest();
	}
}
