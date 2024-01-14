package com.demo.pageobjects;

import org.openqa.selenium.By;

import com.demo.base.BaseClass;
import com.demo.utils.CommonMethod;

public class SearchPageObject extends BaseClass {

	By HomePageText = By.xpath("//h2[contains(text(),'Browse our latest products')]");
	By SearchIcon = By.xpath("(//summary[@aria-label='Search'])[1]");
	By SearchBox=By.xpath("(//input[@placeholder=\"Search\"])[1]");
	By SearchButton=By.xpath("(//button[contains(@class,\"search__button\")])[1]");

	public void validate_HomePage() {
		
		CommonMethod.waitForElementVisibility(HomePageText, 10);
	}

	public void enter_ProductName_Searchbox(String item) throws InterruptedException {
		driver.findElement(SearchIcon).click();
		CommonMethod.waitForElementVisibility(SearchBox, 10);
		driver.findElement(SearchBox).sendKeys(item);
		driver.findElement(SearchButton).click();
	}

	public void validate_ProductName() {
		
	}

}
