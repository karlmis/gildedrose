package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public class ItemWrapperFactory {

    public ItemWrapper createWrapper(Item item) {
        if (SulfurasItemWrapper.isApplicable(item)) {
            return new SulfurasItemWrapper(item);
        }
        if (BackstagePassItemWrapper.isApplicable(item)) {
            return new BackstagePassItemWrapper(item);
        }
        if (AgedBrieItemWrapper.isApplicable(item)) {
            return new AgedBrieItemWrapper(item);

        }
        return new DefaultItemWrapper(item);


    }

}

