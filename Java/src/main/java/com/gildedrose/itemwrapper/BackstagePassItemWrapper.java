package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class BackstagePassItemWrapper extends ItemWrapper {

    public BackstagePassItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        if (isQualityNotAtMax()) {
            increaseQuality();

            if (isSellinInLessThan(10)) {
                if (isQualityNotAtMax()) {
                    increaseQuality();
                }
            }

            if (isSellinInLessThan(5)) {
                if (isQualityNotAtMax()) {
                    increaseQuality();
                }
            }
        }


        if (isSellByDatePassed()) {
            setQualityToZero();
        }
    }


}
