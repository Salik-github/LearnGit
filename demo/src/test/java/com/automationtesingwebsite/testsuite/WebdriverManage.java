package com.automationtesingwebsite.testsuite;

import org.openqa.selenium.WebDriver;

public class WebdriverManage {
    private  static ThreadLocal< WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        return driver.get();
    }
    public static void setDriver(WebDriver webDriver)
    {
        driver.set(webDriver);
    }
    public static void quitDriver()
    {
        getDriver().quit();
        driver.remove();
    }
}
