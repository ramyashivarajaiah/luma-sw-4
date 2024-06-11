package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenMenu;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    /*
    1. verifyTheSortByProductNameFilter
* Mouse Hover on Women Menu
* Mouse Hover on Tops
* Click on Jackets
* Select Sort By filter “Product Name”
* Verify the products name display in
alphabetical order
2. verifyTheSortByPriceFilter
* Mouse Hover on Women Menu
* Mouse Hover on Tops
* Click on Jackets
* Select Sort By filter “Price”
* Verify the products price display in
Low to High
     */

    WomenMenu womenMenu = new WomenMenu();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenMenu.mouseHoverOnWomenMenu();
        womenMenu.mouseHoverOnTops();
        womenMenu.clickOnJackets();
//womenMenu.selectSortByFilterProductName();
//womenMenu.verifyTheProductNameDisplayInAlphabaticalOrder();
        List<String> actualText = womenMenu.storeProductNamesInAscendingOrder();
        womenMenu.selectFilterSortByNames();
        Thread.sleep(2000);
        List<String> expextedText = womenMenu.storeProductNamesAfterFilterName();
        Assert.assertEquals(actualText, expextedText);

    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        womenMenu.mouseHoverOnWomenMenu();
        womenMenu.mouseHoverOnTops();
        womenMenu.clickOnJackets();
        //womenMenu.selectSortByPrice();
        List<Double> actualText = womenMenu.storeProductsNamesByPriceinAscendingOrder();
        womenMenu.selectFilterSortByPriceLowToHigh();
        Thread.sleep(2000);
        List<Double> expextedText = womenMenu.storeProductsNamesByPriceAfterFilterPriceLowToHigh();
        Assert.assertEquals(actualText, expextedText);
    }
}