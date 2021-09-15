package org.flipkartlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagelocator extends Commonaction {

		
		Commonaction ca= new Commonaction();
		
		public Loginpagelocator()
		{
			PageFactory.initElements(ca.d, this);
		}
		
		@FindBy(xpath="//span[contains(text(),'Enter Email')]//preceding::input[1]")
		private WebElement userid;
		
		@FindBy(xpath="//span[contains(text(),'Enter Email')]//following::input[1]")
		private WebElement pass;
		
		@FindBy(xpath="//span[contains(text(),'Enter Password')]//following::button[1]")
		private WebElement login;
		
		@FindBy(xpath="//input[contains(@placeholder,'Search for products')]")
		private WebElement search;
		
		public WebElement getUserid() {
			return userid;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}
		
		public WebElement getSearch() {
			return search;
		}
		
		

}
