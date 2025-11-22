package com.rantomah.designpatterns.structural.flyweight;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    public void test() {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop shop = new TeaShop(teaMaker);

        shop.takeOrder("without sugar", 1);
        shop.takeOrder("natural tea", 2);
        shop.takeOrder("chinese tea", 3);
        shop.takeOrder("natural tea", 5);

        shop.serve();

        assertThat(shop.getOrders().get(2)).isSameAs(shop.getOrders().get(5));
    }
}
