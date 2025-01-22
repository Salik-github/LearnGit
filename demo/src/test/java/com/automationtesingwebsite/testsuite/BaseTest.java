package com.automationtesingwebsite.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.automationtesingwebsite.pagefactory.basketPage;
import com.automationtesingwebsite.pagefactory.homePage;
import static com.automationtesingwebsite.utils.pageURL.MAIN_URL;

public class BaseTest {

    public WebDriver driver;
    public homePage homePageObj;
    public basketPage basketObj; 
    // @BeforeClass
    // public void setUp()
    // {
    // WebDriver driver;

    // WebDriverManager.chromedriver().setup();
    // WebdriverManage.setDriver();
    // driver = WebdriverManage.getDriver();

    // driver.get(MAIN_URL);
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

    // }
    @BeforeClass
    public void setup() {
        driver = WebdriverManage.getDriver();
        driver.get(MAIN_URL);
        homePageObj = new homePage(driver);
        basketObj =  new basketPage(driver);

    }

   // @AfterClass
    public void tearDown() {
        WebdriverManage.quitDriver();
    }

}
