package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void testQualityOfItemIsNeverMoreThan50(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, items[0].quality);
    }

    @Test
    public void testQualityDegradesTwiceAsFastOnceSellDataPasses(){
        Item[] items = new Item[] { new Item("Cake", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(48, items[0].quality);
    }

    @Test
    public void testQualityOfItemIsNotNegative(){
        Item[] items = new Item[] { new Item("Cake", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue("Quality of an item should not be less than 0", items[0].quality > 0);
    }

    @Test
    public void testQualityOfAgedBrieIncreasesTheOlderItGets(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, items[0].quality);
    }

    @Test
    public void testQualityOfSulfurasNeverDecreases(){
        Item[] items = new Item[] { new Item("Sulfuras", -1, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, items[0].quality);
    }

    @Test
    public void testQualityOfQualityOfBackstagePassesIsIncreasedBy2_whenSellInIsLessThan10DaysOrLess(){
        Item[] items = new Item[] { new Item("Backstage passes", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, items[0].quality);
    }

    @Test
    public void testQualityOfQualityOfBackstagePassesIsIncreasedBy3_whenSellInIsLessThan5DaysOrLess(){
        Item[] items = new Item[] { new Item("Backstage passes", 5, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(23, items[0].quality);
    }

    @Test
    public void testQualityOfQualityOfBackstagePassesIsEqualTo0_afterConcert(){
        Item[] items = new Item[] { new Item("Backstage passes", -1, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, items[0].quality);
    }

    @Test
    public void testQualityOfQualityOfConjuredDecreasesBy2(){
        Item[] items = new Item[] { new Item("Conjured", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(18, items[0].quality);
    }

}