package com.automationtesingwebsite.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.automationtesingwebsite.utils.pageURL.BASKET_PAGE;
import static com.automationtesingwebsite.utils.pageURL.selenium_Ruby_URL;

public class homePage extends basePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    public boolean verifySlider() {
        List<WebElement> sliderelement = driver.findElements(slider);
        return sliderelement.size() == 3;
    }

    public boolean verifyArrival() {
        List<WebElement> Arrivalelement = driver.findElements(arrivals);
        return Arrivalelement.size() == 3;
    }

    public void verifyArrivalmgClickable() {
        List<WebElement> ArrivalImage = driver.findElements(arrivals);
        clickElement(ArrivalImage.get(0));
        Assert.assertEquals(selenium_Ruby_URL, driver.getCurrentUrl());
    }

    public void verifyAddtoBasket() {
        WebElement adBasket = driver.findElement(addtobasket);
        clickElement(adBasket);
        WebElement successMgsBasket = driver.findElement(succmgsB);
        successMgsBasket.isDisplayed();
        amountDisplay();
    }

    public void amountDisplay() {
        WebElement amountdis = driver.findElement(amount);
        amountdis.isDisplayed();

    }

    public void clickDecription() {
        clickElement(driver.findElement(descrip));
    }

    public void clickReview() {
        clickElement(driver.findElement(review));
    }

    public void verifyViewBasket() {
        clickElement(driver.findElement(viewBask));
        Assert.assertEquals(driver.getCurrentUrl(), BASKET_PAGE);
    }
}
