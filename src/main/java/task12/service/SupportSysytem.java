package task12.service;

import task12.model.Grocery;
import task12.model.Product;

import java.util.Map;

public class SupportSysytem {

    private Grocery market;

    public SupportSysytem(Grocery market) {
        this.market = market;
    }

    public void printAllGoods() {

    }

    public void addProduct(Product product, int amount) {
        Map<Product, Integer> map = market.getStore().get(product.getType());
        if (map != null) {
            if (map.get(product) != null) {
                map.replace(product, map.get(product) + amount);
            }
        }
    }
}
