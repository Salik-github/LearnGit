package com.automationtesingwebsite.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homeTest extends BaseTest {

    @Test(description = "verify home have 3 sliders")
    public void testCase1() {

        boolean verifysld = homePageObj.verifySlider();
        Assert.assertTrue(verifysld);
    }

    @Test(description = "verify home page have 3 arrival image")
    public void testCase2() {

        boolean verifyarr = homePageObj.verifyArrival();
        Assert.assertTrue(verifyarr);

    }

    @Test(description = "arrival image clickable and Verify added basket", dependsOnMethods= {"testCase2"})
    public void testCase3() {
        homePageObj.verifyArrivalmgClickable();
        homePageObj.verifyAddtoBasket();
        homePageObj.clickDecription();
        homePageObj.clickReview();
    }
    @Test (dependsOnMethods= {"testCase3"})
    public void testCase4()
    {
        homePageObj.verifyViewBasket();
        basketObj.verifytotalPrice();
    }

}
