package com.AdactinMaven.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AdactinBase.BaseClass;

public class SearchHotelPageImp extends BaseClass implements SearchHotelPage{
		public SearchHotelPageImp(){	
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = searchhotel_location_id)
	private WebElement searchhotel_location;
	@FindBy(id = searchhotel_hotels_id)
	private WebElement searchhotel_hotels;
	@FindBy(id = searchhotel_roomtype_id)
	private WebElement searchhotel_roomtype;
	@FindBy(id = searchhotel_roomnos_id)
	private WebElement searchhotel_roomnos;
	@FindBy(id = searchhotel_checkin_id)
	private WebElement searchhotel_checkin;
	@FindBy(id = searchhotel_checkout_id)
	private WebElement searchhotel_checkout;
	@FindBy(id = searchhotel_adults_id)
	private WebElement searchhotel_adults;
	@FindBy(id = searchhotel_child_id)
	private WebElement searchhotel_child;
	@FindBy(id = searchhotel_submit_id)
	private WebElement searchhotel_submit;
	@FindBy(id = searchhotel_btn_id)
	private WebElement searchhotel_btn;
	@FindBy(id = searchhotel_continue_id)
	private WebElement searchhotel_continue;
	
	public WebElement getSearchhotel_location() {
		return searchhotel_location;
	}
	public WebElement getSearchhotel_hotels() {
		return searchhotel_hotels;
	}
	public WebElement getSearchhotel_roomtype() {
		return searchhotel_roomtype;
	}
	public WebElement getSearchhotel_roomnos() {
		return searchhotel_roomnos;
	}
	public WebElement getSearchhotel_checkin() {
		return searchhotel_checkin;
	}
	public WebElement getSearchhotel_checkout() {
		return searchhotel_checkout;
	}
	public WebElement getSearchhotel_adults() {
		return searchhotel_adults;
	}
	public WebElement getSearchhotel_child() {
		return searchhotel_child;
	}
	public WebElement getSearchhotel_submit() {
		return searchhotel_submit;
	}
	public WebElement getSearchhotel_btn() {
		return searchhotel_btn;
	}
	public WebElement getSearchhotel_continue() {
		return searchhotel_continue;
	}

}
