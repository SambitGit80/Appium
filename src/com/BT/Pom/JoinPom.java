package com.BT.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinPom {
	@FindBy(xpath = "new UiSelector().className(\"android.widget.ImageView\")")
	public WebElement Logo;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"JOIN\"]")
	public WebElement JoinButton;
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
	public WebElement DontAllow; 
	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")
	public WebElement WhileUsingtheapp;
	@FindBy(xpath = "//android.widget.EditText[@text=\"First Name\"]")
	public WebElement fn;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Last Name\"]")
	public WebElement ln;
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"+1\"]")
	public WebElement PhonenoDrop;
	@FindBy(xpath = "//android.widget.TextView[@text=\"[+91]  India\"]")
	public WebElement Select91;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Search your country\"]")
	public WebElement searchyourcountry;
	@FindBy(xpath = "//android.widget.EditText[@text=\"Phone\"]")
	public WebElement PhoneText;
	@FindBy(xpath = "//android.widget.EditText[@text=\"ENTER YOUR EMAIL\"]")
	public WebElement email;
	@FindBy(xpath = "(//android.widget.TextView[@text=\"JOIN THE MOVEMENT\"])[8]")
	public WebElement jointheButton;
	
	public JoinPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public WebElement Logo() {
		return Logo;
	}
	public WebElement JoinButton() {
		return JoinButton;
	}
	public WebElement DontAllow() {
		return DontAllow;
	}
	public WebElement WhileUsingtheapp() {
		return WhileUsingtheapp;
	}
	public WebElement fn() {
		return fn;
    }
	public WebElement ln() {
		return ln;
}
	public WebElement PhonenoDrop() {
		return PhonenoDrop;
}
	public WebElement Select91() {
		return Select91;
}
	public WebElement searchyourcountry() {
		return searchyourcountry;
	}
	public WebElement PhoneText() {
		return PhoneText;
}
	public WebElement email() {
		return email;
}
	public WebElement jointheButton() {
		return jointheButton;
}
}