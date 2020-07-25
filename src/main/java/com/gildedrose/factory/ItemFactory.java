package com.gildedrose.factory;

import com.gildedrose.Item;
import com.gildedrose.items.*;

public class ItemFactory {

    public static UpdatableItem getItem(String nameOfItem, int sellIn, int quality){
        if (nameOfItem.contains("Aged Brie")) {
            return new AgedBrie(nameOfItem, sellIn, quality);
        } else if (nameOfItem.contains("Sulfuras")) {
            return new Sulfuras(nameOfItem, sellIn, quality);
        } else if (nameOfItem.contains("Backstage passe")) {
            return new BackstagePasses(nameOfItem, sellIn, quality);
        } else if (nameOfItem.contains("Conjured")) {
            return new Conjured(nameOfItem, sellIn, quality);
        }
        return new OtherItem(nameOfItem, sellIn, quality);
    }
}
