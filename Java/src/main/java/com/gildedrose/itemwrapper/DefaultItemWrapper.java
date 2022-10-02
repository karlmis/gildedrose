package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class DefaultItemWrapper extends ItemWrapper {

    public DefaultItemWrapper(Item item) {
        super(item);
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
