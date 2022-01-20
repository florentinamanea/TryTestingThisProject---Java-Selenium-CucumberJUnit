package test;

public class RightMain {
	public static void main(String[] args) {
		RightTest test = new RightTest();
		test.OpenChromeDriver();
		test.Form();
		test.SelectOption();
		test.ScrollPage();
		test.TypingAndSelect();
		test.SelectColor();
		test.SelectDate();
		test.RangeSlider();
		test.ChooseFile();
		test.QuantityRange();
		test.LongMessage();
		test.SubmitButton();
		test.CloseTab();
		test.TearDownTest();
	}
}
