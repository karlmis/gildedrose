package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public class ItemWrapperFactory {

    public ItemWrapper createWrapper(Item item) {
        if (SulfurasItemWrapper.ITEM_NAME.equals(item.name)) {
            return new SulfurasItemWrapper(item);
        }
        if (BackstagePassItemWrapper.ITEM_NAME.equals(item.name)) {
            return new BackstagePassItemWrapper(item);
        }
        if (AgedBrieItemWrapper.ITEM_NAME.equals(item.name)) {
            return new AgedBrieItemWrapper(item);

        }
        return new DefaultItemWrapper(item);


    }

}

