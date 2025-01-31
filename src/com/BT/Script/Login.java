package com.BT.Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.BT.Generic.Base;
import com.BT.Pom.JoinPom;
import com.BT.Pom.LoginPOM;

public class Login extends Base{

	@Test
	public void Login() {
		LoginPOM l=new LoginPOM(driver);
		wait.until(ExpectedConditions.elementToBeClickable(l.LoginButton())).click();		
		JoinPom p=new JoinPom(driver);
		wait.until(ExpectedConditions.elementToBeClickable(p.WhileUsingtheapp())).click();		
		wait.until(ExpectedConditions.visibilityOf(p.PhoneText())).sendKeys("8095886325");
		wait.until(ExpectedConditions.elementToBeClickable(l.SendCode())).click();
		wait.until(ExpectedConditions.visibilityOf(l.OTP1())).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOf(l.OTP2())).sendKeys("2");
		wait.until(ExpectedConditions.visibilityOf(l.OTP3())).sendKeys("3");
		wait.until(ExpectedConditions.visibilityOf(l.OTP4())).sendKeys("4");
		wait.until(ExpectedConditions.visibilityOf(l.OTP5())).sendKeys("5");
		wait.until(ExpectedConditions.visibilityOf(l.OTP6())).sendKeys("6");
		wait.until(ExpectedConditions.elementToBeClickable(l.Verify())).click();
		wait.until(ExpectedConditions.elementToBeClickable(l.Skip())).click();
		wait.until(ExpectedConditions.elementToBeClickable(l.Dontallow())).click();
		wait.until(ExpectedConditions.elementToBeClickable(l.Close())).click();
		
		
}
}
