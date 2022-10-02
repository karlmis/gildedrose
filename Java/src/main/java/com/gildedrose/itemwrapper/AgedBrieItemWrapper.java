package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class AgedBrieItemWrapper extends ItemWrapper {


    public AgedBrieItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        if (isQualityNotAtMax()) {
            increaseQuality();
        }

        if (isSellByDatePassed()) {
            if (isQualityNotAtMax()) {
                increaseQuality();
            }
        }
    }



}
