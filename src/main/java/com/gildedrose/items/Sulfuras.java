package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras extends Item implements UpdatableItem {

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        this.sellIn--;
    }
}
