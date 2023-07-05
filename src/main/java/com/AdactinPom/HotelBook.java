package com.AdactinPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBase.BaseClass;

public class HotelBook extends BaseClass{
	public HotelBook() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "bookhotel_firstname_id")
	private WebElement bookhotel_firstname;
	@FindBy(id = "bookhotel_lastname_id")
	private WebElement bookhotel_lastname;
	@FindBy(id = "bookhotel_address_id")
	private WebElement bookhotel_address;
	@FindBy(id = "bookhotel_ccnum_id")
	private WebElement bookhotel_ccnum;
	@FindBy(id = "bookhotel_cctype_id")
	private WebElement bookhotel_cctype;
	@FindBy(id = "bookhotel_ccexpmonth_id")
	private WebElement bookhotel_ccexpmonth;
	@FindBy(id = "bookhotel_ccexpyear_id")
	private WebElement bookhotel_ccexpyear;
	@FindBy(id = "bookhotel_cccvv_id")
	private WebElement bookhotel_cccvv;
	@FindBy(id = "bookhotel_booknow_id")
	private WebElement bookhotel_booknow;
	@FindBy(id = "bookhotel_itinerary_id")
	private WebElement bookhotel_itinerary;
	
	
	public WebElement getBookhotel_firstname() {
		return bookhotel_firstname;
	}
	public WebElement getBookhotel_lastname() {
		return bookhotel_lastname;
	}
	public WebElement getBookhotel_address() {
		return bookhotel_address;
	}
	public WebElement getBookhotel_ccnum() {
		return bookhotel_ccnum;
	}
	public WebElement getBookhotel_cctype() {
		return bookhotel_cctype;
	}
	public WebElement getBookhotel_ccexpmonth() {
		return bookhotel_ccexpmonth;
	}
	public WebElement getBookhotel_ccexpyear() {
		return bookhotel_ccexpyear;
	}
	public WebElement getBookhotel_cccvv() {
		return bookhotel_cccvv;
	}
	public WebElement getBookhotel_booknow() {
		return bookhotel_booknow;
	}
	public WebElement getBookhotel_itinerary() {
		return bookhotel_itinerary;
	}
}

