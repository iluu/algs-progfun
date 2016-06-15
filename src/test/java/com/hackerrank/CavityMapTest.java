package com.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CavityMapTest {

    @Test
    public void calculateCavities() {
        String[] arr = {
                "179443854",
                "961621369",
                "164139922",
                "968633951",
                "812882578",
                "257829163",
                "812438597",
                "176656233",
                "485773814"
        };

        String[] result = {
                "179443854",
                "961X21369",
                "164139922",
                "96X633951",
                "812882578",
                "25782X163",
                "8124385X7",
                "176656233",
                "485773814"
        };

        assertArrayEquals(CavityMap.calculateCavities(arr, 9), result);
    }

    @Test
    public void calculateCavities2() {
        String[] arr = {
                "63456754",
                "68335522",
                "25482912",
                "54429472",
                "35416147",
                "75848666",
                "41633675",
                "82511989"
        };

        String[] result = {
                "63456754",
                "6X335522",
                "254X2X12",
                "5442X4X2",
                "35416147",
                "75X4X666",
                "41633675",
                "82511989"
        };

        assertArrayEquals(CavityMap.calculateCavities(arr, 8), result);
    }

}