package com.BT.Script;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.helpers.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.BT.Generic.Base;
import com.BT.Pom.JoinPom;
import com.BT.Pom.LoginPOM;

public class Join_Initial extends Base{
	@Test
	//Verify by opening the BT Mobile App
	public void TC_001() {
		JoinPom j=new JoinPom(driver);
		LoginPOM l=new LoginPOM(driver);
		try {
		 //The introductory Bluetees logo animation is displayed.
		boolean LogoDisplay = wait.until(ExpectedConditions.visibilityOf(j.Logo())).isDisplayed();
		Assert.assertTrue(LogoDisplay,"Logo is notDisplay");
		// "JOIN" buttons is visible
		boolean JoinButtonDisplay = wait.until(ExpectedConditions.visibilityOf(j.JoinButton())).isDisplayed();
		Assert.assertTrue(JoinButtonDisplay,"Logo is notDisplay");
		//"LOG IN" buttons is visible
		boolean LoginButtonDisplay = wait.until(ExpectedConditions.visibilityOf(l.LoginButton())).isDisplayed();
		Assert.assertTrue(LoginButtonDisplay,"Logo is notDisplay");
	}
		catch (Exception e) {
			 e.printStackTrace();
		}
	}
	@Test
	//Verify by clicking the "JOIN" button as a new user
	public void TC_002() {
		LoginPOM l=new LoginPOM(driver);
		JoinPom j=new JoinPom(driver);
	
     try {
     wait.until(ExpectedConditions.elementToBeClickable(j.JoinButton())).click();
     Assert.assertFalse(j.JoinButton().isDisplayed(), "Button is NOT Clicked!");
     wait.until(ExpectedConditions.elementToBeClickable(j.WhileUsingtheapp())).click();
     Assert.assertFalse(j.WhileUsingtheapp().isEnabled(), "Button is NOT Clicked!");
	}
     catch(Exception e) {
    	e.printStackTrace();
     }
	}
}
