package com.gildedrose.itemwrapper;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ItemWrapperTest {
    @Test
    void decreaseQualityDoubleIfNotAtMinimum() {
        MyItemWrapper itemWrapper = MyItemWrapperWithQuality(3);

        itemWrapper.decreaseQualityDoubleIfNotAtMinimum();

        assertThat(itemWrapper.getQuality()).isEqualTo(3-2);
    }

    @Test
    void decreaseQualityDoubleIfNotAtMinimum_ToMinimum() {
        MyItemWrapper itemWrapper = MyItemWrapperWithQuality(2);

        itemWrapper.decreaseQualityDoubleIfNotAtMinimum();

        assertThat(itemWrapper.getQuality()).isEqualTo(2-2);
    }

    @Test
    void decreaseQualityDoubleIfNotAtMinimum_OneBecomesZero() {
        MyItemWrapper itemWrapper = MyItemWrapperWithQuality(1);

        itemWrapper.decreaseQualityDoubleIfNotAtMinimum();

        assertThat(itemWrapper.getQuality()).isEqualTo(0);
    }

    @Test
    void decreaseQualityDoubleIfNotAtMinimum_ZeroStaysZero() {
        MyItemWrapper itemWrapper = MyItemWrapperWithQuality(0);

        itemWrapper.decreaseQualityDoubleIfNotAtMinimum();

        assertThat(itemWrapper.getQuality()).isEqualTo(0);
    }





    private static MyItemWrapper MyItemWrapperWithQuality(int quality) {
        return new MyItemWrapper(quality);
    }

    private static class MyItemWrapper extends ItemWrapper {
        public MyItemWrapper(int quality) {
            super(new Item("something", 0, quality));
        }

        @Override
        public void update() {

        }

        public int getQuality(){
            return item.quality;
        }
    }
}
