package com.gildedrose;

public class ItemWrapperFactory {

    public ItemWrapper createWrapper(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasItemWrapper();
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassItemWrapper(item);
        }
        if (item.name.equals("Aged Brie")) {
            return new AgedBrieItemWrapper(item);

        }
        return new DefaultItemWrapper(item);


    }

}

