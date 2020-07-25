package com.gildedrose;

import com.gildedrose.factory.ItemFactory;
import com.gildedrose.items.UpdatableItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality(){
        //convert all items to updatable items
        UpdatableItem[] updatableItems = mapToUpdatableItem(items);
        for (int i = 0; i < updatableItems.length; i++) {
            updatableItems[i].updateItem();
            items[i] = (Item) updatableItems[i];
        }

    }

    public UpdatableItem[] mapToUpdatableItem(Item[] items){
        UpdatableItem[] result = new UpdatableItem[items.length];
        for(int i = 0; i < items.length; i++){
            result[i] = ItemFactory.getItem(items[i].name, items[i].sellIn, items[i].quality);
        }
        return result;
    }

//    public void updateQuality() {
//        for (int i = 0; i < items.length; i++) {
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.contains("Backstage passes")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.contains("Sulfuras")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.contains("Backstage passes")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.contains("Sulfuras")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.contains("Backstage")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.contains("Sulfuras")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
//        }
//    }
}