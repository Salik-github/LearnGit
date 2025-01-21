package com.automationtesingwebsite.testsuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import static com.automationtesingwebsite.utils.pageURL.MAIN_URL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    protected  WebDriver driver;

    @BeforeSuite
    public  void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(MAIN_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
    }
}
