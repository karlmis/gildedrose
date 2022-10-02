package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class BackstagePassItemWrapper extends ItemWrapper {

    public BackstagePassItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        if (item.quality < 50) {
            increaseQualityIfNotAtMaximum();

            if (isSellinInLessThan(10)) {
                increaseQualityIfNotAtMaximum();
            }

            if (isSellinInLessThan(5)) {
                increaseQualityIfNotAtMaximum();
            }
        }


        if (isSellByDatePassed()) {
            setQualityToZero();
        }
    }


}
