package com.gildedrose;

public class ItemWrapperFactory {

    public ItemWrapper createWrapper(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new ItemWrapper() {
                @Override
                public void update() {

                }
            };
        }
        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new ItemWrapper() {
                @Override
                public void update() {
                    item.sellIn = item.sellIn - 1;

                    if (item.quality < 50) {
                        item.quality = item.quality + 1;

                        if (item.sellIn < 10) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }

                        if (item.sellIn < 5) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }


                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                }

            };
        }
        if (item.name.equals("Aged Brie")) {
            return new ItemWrapper() {
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

            };

        }
        return new ItemWrapper() {
            @Override
            public void update() {
                item.sellIn = item.sellIn - 1;

                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }

                if (item.sellIn < 0) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                }
            }


        };


    }
}

