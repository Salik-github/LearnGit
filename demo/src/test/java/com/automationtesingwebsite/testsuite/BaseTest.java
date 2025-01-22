package com.automationtesingwebsite.testsuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.automationtesingwebsite.utils.pageURL.MAIN_URL;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    @BeforeClass
    public  void setUp()
    {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        WebdriverManage.setDriver(new ChromeDriver());
        driver = WebdriverManage.getDriver();
        driver.manage().window().maximize();
        driver.get(MAIN_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        
    }
}
