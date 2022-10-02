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


    boolean isQualityNotAtMax() {
        return item.quality < 50;
    }

    boolean isQualityNotAtMinimum() {
        return item.quality > 0;
    }

    void increaseQuality() {
        item.quality = item.quality + 1;
    }
    void decreaseQuality() {
        item.quality = item.quality - 1;
    }

    void setQualityToZero() {
        item.quality = 0;
    }
}
