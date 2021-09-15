package org.flipkartlogin;

    import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Commonaction {
		public static WebDriver d;


		public void launch(String url)
		{
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			d.get(url);
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		

		public void passvalue(WebElement element,String value) throws InterruptedException
		{
			element.sendKeys(value);
			Thread.sleep(1000);
		}
		
		public void submit(WebElement ele) throws InterruptedException//login
		{
			ele.click();//login.click
			Thread.sleep(1000);
		}
		
		public void mouseover(WebElement ele) throws InterruptedException
		{
			Actions a = new Actions(d);
			a.moveToElement(ele).build().perform();
			Thread.sleep(1000);
		}
		
		
		
		public void closebrowser()
		{
			d.quit();
		}

	}
