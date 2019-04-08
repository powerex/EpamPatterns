package task12.model;

import java.util.Map;

public class Grocery {

    private Map<Type, Map<Product, Integer>> store;

    public Grocery(Map<Type, Map<Product, Integer>> store) {
        this.store = store;
    }

    public Map<Type, Map<Product, Integer>> getStore() {
        return store;
    }

    public void setStore(Map<Type, Map<Product, Integer>> store) {
        this.store = store;
    }


}
