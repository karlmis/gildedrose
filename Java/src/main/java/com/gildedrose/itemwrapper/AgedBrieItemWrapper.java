package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class AgedBrieItemWrapper extends ItemWrapper {


    private static final String ITEM_NAME = "Aged Brie";

    public AgedBrieItemWrapper(Item item) {
        super(item);
    }

    static boolean isApplicable(Item item){
        return ITEM_NAME.equals(item.name);
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
