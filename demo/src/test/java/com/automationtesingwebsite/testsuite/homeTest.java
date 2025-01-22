package com.automationtesingwebsite.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automationtesingwebsite.pagefactory.homePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homeTest extends BaseTest {

   
    @Test(description = "verify home have 3 sliders")
    public void testCase1() {
         WebDriver driver = WebdriverManage.getDriver();
        homePage homePageObj = new homePage(driver);
        boolean verifysld = homePageObj.verifySlider();
        Assert.assertTrue(verifysld);
    }
    @Test(description = "verify home page have 3 arrival image")
    public void testCase2()
    {
        WebDriver driver = WebdriverManage.getDriver();
        homePage homePageObj = new homePage(driver);
        boolean verifyarr = homePageObj.verifyArrival();
        Assert.assertTrue(verifyarr);

    }

}
