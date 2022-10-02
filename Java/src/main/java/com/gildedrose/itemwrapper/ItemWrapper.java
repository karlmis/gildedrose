package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public abstract class ItemWrapper {
    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    protected final Item item;

    public ItemWrapper(Item item) {
        this.item = item;
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
        if (item.quality < MAX_QUALITY) {
            item.quality = item.quality + 1;
        }
    }

    void decreaseQualityIfNotAtMinimum() {
        item.quality = Math.max(0, item.quality - 1);
    }

    void decreaseQualityDoubleIfNotAtMinimum() {
        item.quality = Math.max(0, item.quality - 2);
    }

    boolean isQualityAtMaximum() {
        return item.quality < MAX_QUALITY;
    }

    void setQualityToMinimum() {
        item.quality = MIN_QUALITY;
    }
}
