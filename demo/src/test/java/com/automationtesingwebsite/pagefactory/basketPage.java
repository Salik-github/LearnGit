package com.automationtesingwebsite.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class basketPage extends basePage {
    
    public basketPage(WebDriver driver) {
        super(driver);
    }
    
    public void verifytotalPrice()
    {
       List< WebElement> rowCount = driver.findElements(row);
      

       System.out.println(rowCount);
       for(WebElement row : rowCount)
       {
        WebElement price = driver.findElement(pricerow);
        WebElement quanity = driver.findElement(quanityE);
        WebElement total = driver.findElement(totalE);
 
          String pricetext = price.getText().replace("₹", "").replace(",", "");
          double priceValue = Double.parseDouble(pricetext);
          System.out.print(priceValue);
          String valuetext = quanity.getAttribute("value");
          int value = Integer.parseInt(valuetext);
          System.out.print(value);

          String totaltext = total.getText().replace("₹", "").replace(",", "");
          double totalValue = Double.parseDouble(totaltext);
          System.out.print(totalValue);

          double totalCalculated = priceValue * value;
          System.out.print(totalCalculated);
          Assert.assertEquals(totalValue, totalCalculated, "Mismatch in total for row.");

       }
    }
}
