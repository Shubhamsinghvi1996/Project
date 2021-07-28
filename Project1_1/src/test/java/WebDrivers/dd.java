package WebDrivers;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class dd{

	@Test 

	public void date3()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");


		WebDriver dd = new ChromeDriver();
		dd.get("http://demo.automationtesting.in/Datepicker.html");

		JavascriptExecutor JSE = (JavascriptExecutor) dd;

		JSE.executeScript("document.getElementById('datepicker1').value='29/07/2010'");	
	} 
}