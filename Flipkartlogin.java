package org.flipkartlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartlogin extends Commonaction {


		Loginpagelocator lp = new Loginpagelocator();

		public void chromelaunch() throws InterruptedException 
		{
			launch("https://www.flipkart.com");
		}

		public void login() throws InterruptedException {
			
			passvalue(lp.getUserid(), "8508489579");
			passvalue(lp.getPass(),"8508489579");
			submit(lp.getLogin());
		}

		public void productsearch() throws InterruptedException {
			passvalue(lp.getSearch(), "mobile");
			d.findElement(By.className("L0Z3Pu")).click();
		}


		public static void main(String[] args) throws InterruptedException {
			Flipkartlogin o=new Flipkartlogin();
			o.chromelaunch();
			o.login();
			o.productsearch();
			o.closebrowser();
			
		}
	}


	
