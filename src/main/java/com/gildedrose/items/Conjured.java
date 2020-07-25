package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends Item implements UpdatableItem {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (this.quality < 50) {
            this.quality -= 2;
        }
        this.sellIn--;
    }
}
