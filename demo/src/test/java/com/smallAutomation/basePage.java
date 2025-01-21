package com.smallAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {

    protected WebDriver driver;

    basePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void waitElement(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void clickelement(WebElement clickElement)
    {
        clickElement.click();
    }
}
