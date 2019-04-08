package task12.model;

import java.util.Objects;

public class Product {

    private String name;
    private Type type;
    private Provider provider;

    public Product(String name, Type type, Provider provider) {
        this.name = name;
        this.type = type;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(provider, product.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, provider);
    }
}
