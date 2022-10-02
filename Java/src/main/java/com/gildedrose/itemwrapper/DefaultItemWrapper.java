package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class DefaultItemWrapper implements ItemWrapper {
    private final Item item;

    public DefaultItemWrapper(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn = item.sellIn - 1;

        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }


}
