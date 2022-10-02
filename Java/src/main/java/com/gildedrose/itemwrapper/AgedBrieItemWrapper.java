package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class AgedBrieItemWrapper extends ItemWrapper {


    public AgedBrieItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        increaseQualityIfNotAtMaximum();

        if (isSellByDatePassed()) {
            increaseQualityIfNotAtMaximum();
        }
    }




}
