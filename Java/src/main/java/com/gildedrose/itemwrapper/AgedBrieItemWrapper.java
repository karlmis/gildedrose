package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class AgedBrieItemWrapper extends ItemWrapper {


    public AgedBrieItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        item.sellIn = item.sellIn - 1;

        if (item.quality < 50) {
            item.quality = item.quality + 1;

        }

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

}
