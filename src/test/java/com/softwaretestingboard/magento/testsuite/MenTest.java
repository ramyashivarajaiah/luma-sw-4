package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenMenu;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    /*
    userShouldAddProductSuccessFullyTo
ShoppinCart()
* Mouse Hover on Men Menu
* Mouse Hover on Bottoms
* Click on Pants
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on size
32.
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on colour
Black.
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on
‘Add To Cart’ Button.
* Verify the text
‘You added Cronus Yoga Pant to your shopping cart.’
* Click on ‘shopping cart’ Link into
message
* Verify the text ‘Shopping Cart.’
* Verify the product name ‘Cronus Yoga Pant’
* Verify the product size ‘32’
* Verify the product colour ‘Black’
     */
    MenMenu menMenu = new MenMenu();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        menMenu.mouseHoverOnMenMenu();
        menMenu.mouseHoverOnBottoms();
        menMenu.clickOnPants();
        menMenu.clickOnProductNameAndSize();
        menMenu.mouseHoverProductNameAndColour();
        menMenu.mouseHoverProductNameAndAddToCart();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menMenu.verifyAddShoppingCartMessage();
        Assert.assertEquals(actualText, expectedText, "Display Message is incorrect ");
        menMenu.clickOnShoppingCart();
        String expectedResult = "Shopping Cart";
        String actualResult = menMenu.textVerify();
        Assert.assertEquals(actualResult, expectedResult, "Text didn't match!");
        String expectedName = "Cronus Yoga Pant";
        String actualName = menMenu.verifyProductName();
        Assert.assertEquals(actualName, expectedName, "Product name couldn't found ");
        String expectedSize = "32";
        String actualSize = menMenu.verifyProductSize();
        Assert.assertEquals(actualSize, expectedSize, "Product size couldn't found ");
        String expectedcolour = "Black";
        String actualcolour = menMenu.verifyProductColour();
        Assert.assertEquals(actualcolour, expectedcolour, "colour couldn't found ");
    }


}
