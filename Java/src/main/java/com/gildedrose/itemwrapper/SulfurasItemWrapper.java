package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

class SulfurasItemWrapper extends ItemWrapper {
    private static final String ITEM_NAME = "Sulfuras, Hand of Ragnaros";

    public SulfurasItemWrapper(Item item) {
        super(item);
    }

    static boolean isApplicable(Item item){
        return ITEM_NAME.equals(item.name);
    }


    @Override
    public void update() {
        //nothing happens
    }
}
