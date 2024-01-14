package com.demo.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.base.BaseClass;

public class CommonMethod extends BaseClass{
	
	public static WebElement waitForElementVisibility(By locator, int timeoutInSeconds) {
		
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds) );
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	
	public static WebElement waitForElementClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
	
	public static void clickUntilInvisible(By locator, int timeoutInSeconds) {
      
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));

        // Perform a loop to click until the element becomes invisible
        while (true) {
            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                element.click();
            } catch (Exception e) {
                // Element is not clickable or has become invisible
                break;
            }
        }
	}
}
