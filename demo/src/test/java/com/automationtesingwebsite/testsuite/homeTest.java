package com.automationtesingwebsite.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationtesingwebsite.pagefactory.homePage;

public class homeTest extends BaseTest {

    @Test(description = "verify home have 3 sliders")
    public void testCase1() {
        homePage homePageObj = new homePage(driver);
        boolean verifysld = homePageObj.verifySlider();
        Assert.assertTrue(verifysld);
    }

}
