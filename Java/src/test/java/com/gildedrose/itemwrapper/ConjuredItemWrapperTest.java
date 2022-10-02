package com.gildedrose.itemwrapper;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConjuredItemWrapperTest {

    @Test
    void update() {
        Item conjuredItem = new Item("Conjured", 3, 13);

        new ConjuredItemWrapper(conjuredItem).update();

        assertThat(conjuredItem.sellIn).isEqualTo(3 - 1);
        assertThat(conjuredItem.quality).isEqualTo(13 - 2);
    }

    @Test
    void update_AtSellByDatePassed() {
        Item conjuredItem = new Item("Conjured", 0, 13);

        new ConjuredItemWrapper(conjuredItem).update();

        assertThat(conjuredItem.sellIn).isEqualTo(-1);
        assertThat(conjuredItem.quality).isEqualTo(13 - 4);
    }

    @Test
    void update_AtSellByDatePassed_QualityGoesToMinimum() {
        Item conjuredItem = new Item("Conjured", 0, 3);

        new ConjuredItemWrapper(conjuredItem).update();

        assertThat(conjuredItem.sellIn).isEqualTo(-1);
        assertThat(conjuredItem.quality).isEqualTo(0);
    }

    @Test
    void update_QualityGoesToMinimum() {
        Item conjuredItem = new Item("Conjured", 3, 1);

        new ConjuredItemWrapper(conjuredItem).update();

        assertThat(conjuredItem.sellIn).isEqualTo(3 - 1);
        assertThat(conjuredItem.quality).isEqualTo(0);
    }

    @Test
    void isApplicable() {
        assertThat(ConjuredItemWrapper.isApplicable(itemWithName("Conjured"))).isTrue();
        assertThat(ConjuredItemWrapper.isApplicable(itemWithName("something"))).isFalse();

        assertThat(ConjuredItemWrapper.isApplicable(itemWithName(null))).isFalse();
    }

    private static Item itemWithName(String conjured) {
        return new Item(conjured, 1, 1);
    }
}
