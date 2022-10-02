package com.gildedrose.itemwrapper;

import com.gildedrose.Item;

public abstract class ItemWrapper {
    protected final Item item;
    public ItemWrapper(Item item) {
        this.item= item;
    }

    public abstract void update();
}
