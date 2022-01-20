package test;

public class LeftMain {
	public static void main(String[] args) {
		LeftTest leftTest = new LeftTest();
		leftTest.OpenChromeDriver();
		leftTest.Alert();
		leftTest.TooltipOption();
		leftTest.DoubleClick();
		leftTest.ScrollDiv();
		
//		leftTest.DragAndDrop();
		
		leftTest.SampleLoginPage();
		leftTest.LoginButton();
	}
}
