package com.BT.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"LOG IN\"]")
	public WebElement LoginButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SEND CODE\"]")
    public WebElement SendCode;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[1]")
    public WebElement OTP1;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[2]")
    public WebElement OTP2;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[3]")
    public WebElement OTP3;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[4]")
    public WebElement OTP4;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[5]")
    public WebElement OTP5;
    @FindBy(xpath = "(//android.widget.EditText[@resource-id=\"textInput\"])[6]")
    public WebElement OTP6;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"VERIFY, VERIFY, VERIFY, VERIFY, VERIFY, VERIFY, VERIFY, VERIFY\"]")
    public WebElement Verify;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"SKIP\"]")
    public WebElement Skip;
    @FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_deny_button\"]")
    public WebElement Dontallow;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"CLOSE\"]")
    public WebElement Close;
    
	public LoginPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public WebElement LoginButton() {
		return LoginButton;
	}
	public WebElement SendCode() {
		return SendCode;
	}
	public WebElement OTP1() {
		return OTP1;
	}
	public WebElement OTP2() {
		return OTP2;
	}
	public WebElement OTP3() {
		return OTP3;
	}
	public WebElement OTP4() {
		return OTP4;
	}
	public WebElement OTP5() {
		return OTP5;
	}
	public WebElement OTP6() {
		return OTP6;
	}
	public WebElement Verify() {
		return Verify;
	}
	public WebElement Skip() {
		return Skip;
	}
	public WebElement Dontallow() {
		return Dontallow;
	}
	public WebElement Close() {
		return Close;
	}
}
