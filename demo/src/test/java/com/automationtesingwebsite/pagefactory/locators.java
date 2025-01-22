package com.automationtesingwebsite.pagefactory;

import org.openqa.selenium.By;

public class locators {
    protected  final By slider = By.xpath("//div[contains(@class,'n2-ss-slider-')]");
    protected final By arrivals = By.cssSelector(".woocommerce-LoopProduct-link");
    protected final By addtobasket = By.xpath("//button[@class='single_add_to_cart_button button alt']");
    protected  final By succmgsB = By.cssSelector(".woocommerce-message");
    protected final By descrip = By.xpath("//a[text()='Description']");
    protected final By review = By.xpath("//a[text()='Reviews (0)']");
    protected final By viewBask = By.xpath("//a[@class='button wc-forward']");
    protected  final  By amount = By.xpath("//span[@class='woocommerce-Price-amount amount']");


    //basket 

    protected  final By row = By.cssSelector(".cart_item");
    protected final By pricerow = By.cssSelector(".product-price .woocommerce-Price-amount");
    protected  final By quanityE = By.cssSelector(".product-quantity input");
    protected final By totalE = By.cssSelector(".product-subtotal .woocommerce-Price-amount");


}
