package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public abstract class ItemWrapper {
    protected final Item item;
    public ItemWrapper(Item item) {
        this.item= item;
    }

    public abstract void update();

    boolean isSellByDatePassed() {
        return item.sellIn < 0;
    }

    void decreateSellin() {
        item.sellIn = item.sellIn - 1;
    }

    boolean isSellinInLessThan(int x) {
        return item.sellIn < x;
    }

    void increaseQualityIfNotAtMaximum() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    void decreaseQualityIfNotAtMinimum() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    void setQualityToZero() {
        item.quality = 0;
    }
}
