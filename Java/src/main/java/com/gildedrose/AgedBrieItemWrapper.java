package com.gildedrose;

class AgedBrieItemWrapper implements ItemWrapper {
    private final Item item;

    public AgedBrieItemWrapper(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn = item.sellIn - 1;

        if (item.quality < 50) {
            item.quality = item.quality + 1;

        }

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

}
