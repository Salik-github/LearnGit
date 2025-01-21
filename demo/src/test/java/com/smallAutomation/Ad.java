package com.smallAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.smallAutomation.constant.ADPAGEURL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ad {
    
    pagefactory oc ; 
    WebDriver driver; 
    @BeforeSuite
    public void Getbrowser()
    {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
       
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        oc = new pagefactory(driver);
       
    }
    @Test(description="Close the ad in the page")
    public void testcase1()
    {
        driver.get(ADPAGEURL);
        oc.add().closeElement();
        
    } 
}
