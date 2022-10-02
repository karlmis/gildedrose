package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public class ConjuredItemWrapper extends ItemWrapper{
    public ConjuredItemWrapper(Item item) {
        super(item);
    }

    static boolean isApplicable(Item item){
        return item.name != null && item.name.startsWith("Conjured");
    }

    @Override
    public void update() {
        decreateSellin();

        decreaseQualityDoubleIfNotAtMinimum();

        if (isSellByDatePassed()) {
            decreaseQualityDoubleIfNotAtMinimum();
        }
    }
}
