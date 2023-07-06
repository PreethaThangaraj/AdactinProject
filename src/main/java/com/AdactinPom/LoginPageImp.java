package com.AdactinPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBase.BaseClass;

public class LoginPageImp extends BaseClass implements LoginPage {
	public LoginPageImp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = login_username_id)
	private WebElement login_username;
	
	@FindBy(id = Login_password_id)
	private WebElement Login_password;
	
	@FindBy(id = login_btn_id)
	private WebElement login_btn;
	
	public WebElement getLogin_username() {
		return login_username;
	}

	public WebElement getLogin_password() {
		return Login_password;
	}
	public WebElement getLogin_btn() {
		return login_btn;
	}
}
