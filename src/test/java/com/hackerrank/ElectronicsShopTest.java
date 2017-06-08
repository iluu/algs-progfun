package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.ElectronicsShop.getMoneySpent;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ElectronicsShopTest {

    @Test
    public void firstTestCase() {
        assertThat(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10)).isEqualTo(9);
    }

    @Test
    public void secondTestCase() {
        assertThat(getMoneySpent(new int[]{4}, new int[]{5}, 5)).isEqualTo(-1);
    }
}