package com.gildedrose;

import com.gildedrose.itemwrapper.ItemWrapperFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateQuality(item);
        }
    }

    private void updateQuality(Item item) {
        new ItemWrapperFactory().createWrapper(item).update();
    }


}
