package com.automationtesingwebsite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends  basePage{
    

    public homePage(WebDriver driver)
    {
        super(driver);  
    }
    private final By slider = By.xpath("//div[contains(@class,'n2-ss-slider-')]");


    public boolean  verifySlider()
    {
        List<WebElement> sliderelement = driver.findElements(slider);
        return sliderelement.size() ==3; 
    }
}
