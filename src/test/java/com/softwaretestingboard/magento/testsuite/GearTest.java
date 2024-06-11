package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearMenu;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    /*
    1. userShouldAddProductSuccessFullyTo
ShoppinCart()
* Mouse Hover on Gear Menu
* Click on Bags
* Click on Product Name ‘Overnight Duffle’
* Verify the text ‘Overnight Duffle’
* Change Qty 3
* Click on ‘Add to Cart’ Button.
* Verify the text
‘You added Overnight Duffle to your shopping cart.’
* Click on ‘shopping cart’ Link into
message
* Verify the product name ‘Cronus Yoga Pant’
* Verify the Qty is ‘3’
* Verify the product price ‘$135.00’
* Change Qty to ‘5’
* Click on ‘Update Shopping Cart’ button
* Verify the product price ‘$225.00’
     */
    GearMenu gearMenu = new GearMenu();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        gearMenu.mouseHoverOnGear();
        gearMenu.clickonbagsTab();
        gearMenu.clickonProductName();
        gearMenu.getVerifyMessage();
        String expectedText = "Overnight Duffle";
        String actualText = gearMenu.getVerifyMessage();
        Assert.assertEquals(actualText, expectedText, "Product not verify");
        gearMenu.clearT();
        gearMenu.changeQty();
        gearMenu.clickOnAddToCart();
        String expectedCartMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartMessage = gearMenu.verifyAddCartMessage();
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Product not added in to cart");
        gearMenu.clickOnShoppingCartMessage();
        String expectedQty = "3";
        String actualQty = gearMenu.verifyQuantity();
        Assert.assertEquals(actualQty, expectedQty, "Quanitity not match");
        String expectedPrice = "$135.00";
        String actualPrice = gearMenu.verifyPriceOfBag();
        Assert.assertEquals(actualPrice, expectedPrice, "Price not match");
        gearMenu.clearT1();
        gearMenu.clickTochangeQty();
        Thread.sleep(2000);
        gearMenu.clickOnUpdateShoppingCart();
        String expectedPriceFor5Bag = "$225.00";
        String actualPriceFor5Bag = gearMenu.verifyPriceOfBag5();
        Assert.assertEquals(actualPriceFor5Bag, expectedPriceFor5Bag, "Price not Match");

    }
}