package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	//slkvslkv
     @FindBy(name="uid")
      WebElement txbtn;
     @FindBy(name="password")
      WebElement pwsbtn;
     @FindBy(name="btnLogin")
      WebElement lgbtn;
     
     public LoginPage(WebDriver driver){
    	 PageFactory.initElements(driver, this);
     }
     public void setLogin(String usn,String pwd) {
    	 txbtn.sendKeys(usn);
    	 pwsbtn.sendKeys(pwd);
    	 lgbtn.click();
     }
}
