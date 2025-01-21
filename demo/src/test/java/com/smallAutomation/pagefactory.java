package com.smallAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagefactory extends basePage {

    public By close = By.cssSelector("button[aria-label='Close']");
    public   By ad = By.id("popmake-1272");

    public pagefactory(WebDriver driver) {
        super(driver);
    }
    
    public pagefactory add()
    {
        waitElement(driver.findElement(ad));
        return this;
    }
    public pagefactory closeElement()
    {
        clickelement( driver.findElement(close));
        return this;
     
    }
}
