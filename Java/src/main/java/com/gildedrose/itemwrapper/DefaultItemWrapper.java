package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class DefaultItemWrapper extends ItemWrapper {

    public DefaultItemWrapper(Item item) {
        super(item);
    }

    @Override
    public void update() {
        decreateSellin();

        decreaseQualityIfNotAtMinimum();

        if (isSellByDatePassed()) {
            decreaseQualityIfNotAtMinimum();
        }
    }


}
