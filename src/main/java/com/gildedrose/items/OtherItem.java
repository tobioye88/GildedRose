package com.gildedrose.items;

import com.gildedrose.Item;

public class OtherItem extends Item implements UpdatableItem {

    public OtherItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        this.quality--;
        if(this.sellIn <= 0){
            this.quality--;
        }
        this.sellIn--;
    }
}
