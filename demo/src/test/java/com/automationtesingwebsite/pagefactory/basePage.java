package com.automationtesingwebsite.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePage extends locators {

    public  WebDriver driver;
    public basePage(WebDriver driver) {
    this.driver = driver;
    }

    public void clickElement(WebElement element)
    {
        element.click();
    }
    
}
