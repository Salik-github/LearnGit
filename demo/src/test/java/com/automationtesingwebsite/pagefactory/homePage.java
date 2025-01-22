package com.automationtesingwebsite.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage extends  basePage{
    
    private final By slider = By.xpath("//div[contains(@class,'n2-ss-slider-')]");
    private final By arrivals = By.cssSelector(".woocommerce-LoopProduct-link");

    public homePage(WebDriver driver)
    {
        super(driver);  
    }


    public boolean  verifySlider()
    {
        List<WebElement> sliderelement = driver.findElements(slider);
        return sliderelement.size() ==3; 
    }
    public boolean verifyArrival()
    {
        List<WebElement> Arrivalelement = driver.findElements(arrivals);
        return Arrivalelement.size() ==3; 
    }
}
