package com.BT.Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BT.Generic.Base;
import com.BT.Pom.JoinPom;

public class Join extends Base {
	
	@Test
	public void Joining() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  //  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    JoinPom j=new JoinPom(driver);
    Thread.sleep(3000);
    wait.until(ExpectedConditions.visibilityOf(j.JoinButton()));
    j.JoinButton().click();
   Assert.assertTrue(j.DontAllow().isDisplayed(),"clicked");
   wait.until(ExpectedConditions.elementToBeClickable(j.WhileUsingtheapp()));
   j.WhileUsingtheapp().click();
   
   wait.until(ExpectedConditions.visibilityOf(j.fn())).sendKeys("AppTest");
   wait.until(ExpectedConditions.visibilityOf(j.ln())).sendKeys("Automation");
   wait.until(ExpectedConditions.elementToBeClickable(j.PhonenoDrop())).click(); 
   wait.until(ExpectedConditions.visibilityOf(j.searchyourcountry())).click();
   wait.until(ExpectedConditions.visibilityOf(j.searchyourcountry())).sendKeys("+91");
   wait.until(ExpectedConditions.elementToBeClickable(j.Select91())).click();
   wait.until(ExpectedConditions.visibilityOf(j.PhoneText())).sendKeys("8095886325");
   wait.until(ExpectedConditions.visibilityOf(j.email())).sendKeys("test@gmail.com");
   wait.until(ExpectedConditions.elementToBeClickable(j.jointheButton())).click();
   
}
}