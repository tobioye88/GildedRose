package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends Item implements  UpdatableItem {

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (this.quality < 50) {
            if (this.sellIn < 11) {
                this.quality += 2;
            }

            if (this.sellIn < 6) {
                this.quality += 1;
            }
        }
        if (this.sellIn < 0) {
            this.quality = 0;
        }
        this.sellIn--;
    }
}
