package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearMenu extends Utility {

    By mouseHover = By.xpath("//span[normalize-space()='Gear']");
    By clickonBags = By.xpath("//span[normalize-space()='Bags']");
    By clickOnProduct = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyBag = By.xpath("//span[@class='base']");
    By quantity = By.xpath("//input[@id='qty']");
    By clear = By.xpath("//input[@id='qty']");
    By clickOnCart = By.xpath("//button[@id='product-addtocart-button']");
    By verifyAddCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickonLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyqty = By.xpath("//input[@title='Qty']");
    By verifyPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By clear1 = By.xpath("//input[@class='input-text qty']");
    By changeQty = By.xpath("//input[@class='input-text qty']");
    By updateShoppingCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    By verifyPrice1 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public void mouseHoverOnGear() {
        mouseHoverToElement(mouseHover);
    }

    public void clickonbagsTab() {
        mouseHoverToElementAndClick(clickonBags);
    }

    public void clickonProductName() {
        mouseHoverToElementAndClick(clickOnProduct);
    }

    public String getVerifyMessage() {
        return getTextFromElement(verifyBag);
    }

    public void changeQty() {
        sendTextToElement(quantity, "3");
    }

    public void clearT() {
        clearText(clear);
    }

    public void clickOnAddToCart() {
        clickOnElement(clickOnCart);
    }

    public String verifyAddCartMessage() {
        return getTextFromElement(verifyAddCart);
    }

    public void clickOnShoppingCartMessage() {
        mouseHoverToElementAndClick(clickonLink);
    }

    public String verifyQuantity() {
        return getAttributeValue(verifyqty, "value");
    }

    public String verifyPriceOfBag() {
        return getTextFromElement(verifyPrice);
    }

    public void clickTochangeQty() {
        sendTextToElement(changeQty, "5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String verifyPriceOfBag5() {
        return getTextFromElement(verifyPrice1);
    }

    public void clearT1() {
        clearText(clear1);
    }


}