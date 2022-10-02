package com.gildedrose;

import com.gildedrose.itemwrapper.ItemWrapper;
import com.gildedrose.itemwrapper.ItemWrapperFactory;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class GildedRose {
    Item[] items;
    private final List<ItemWrapper> itemWrappers;

    public GildedRose(Item[] items) {
        this.items = items;
        ItemWrapperFactory itemWrapperFactory = new ItemWrapperFactory();
        itemWrappers = Arrays.stream(items)
            .map(itemWrapperFactory::createWrapper)
            .collect(toList());
    }

    public void updateQuality() {
        itemWrappers.forEach(ItemWrapper::update);
    }



}
