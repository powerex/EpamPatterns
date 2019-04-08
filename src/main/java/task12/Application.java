package task12;

import task12.model.Grocery;
import task12.model.Product;
import task12.model.Provider;
import task12.model.Type;
import task12.service.SupportSysytem;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Provider provider = new Provider();
        Map<Product, Integer> productMap = new HashMap<>();
        Map<Type, Map<Product, Integer>> market = new HashMap<>();
        Product p1 = new Product("Tea", Type.DRINKS, provider);

        Grocery grocery = new Grocery(market);
        SupportSysytem support = new SupportSysytem(grocery);

        support.addProduct(p1, 10);
    }
}
