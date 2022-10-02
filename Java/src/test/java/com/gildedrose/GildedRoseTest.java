package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
   //     assertEquals("fixme", app.items[0].name);
    }

    @Test
    void testGoldenMaster() throws URISyntaxException {
        String outputStringFor = TexttestFixture.getOutputStringFor(18);
        URL resourceUri = GildedRoseTest.class.getClassLoader().getResource("goldenmaster.txt");

        Path path = Paths.get(resourceUri.toURI());
        System.out.println("outputStringFor = " + outputStringFor+"\na");
        assertThat(path).hasContent(outputStringFor);
    }
}
