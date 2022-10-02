package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class BackstagePassItemWrapper extends ItemWrapper {

    static final String ITEM_NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePassItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        if (isQualityAtMaximum()) {
            increaseQualityIfNotAtMaximum();

            if (isSellinInLessThan(10)) {
                increaseQualityIfNotAtMaximum();
            }

            if (isSellinInLessThan(5)) {
                increaseQualityIfNotAtMaximum();
            }
        }


        if (isSellByDatePassed()) {
            setQualityToMinimum();
        }
    }

}
