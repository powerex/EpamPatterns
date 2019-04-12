package task2.model;

public class Product implements Item {

    int id;
    String value;

    public Product(int id, String value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public void print(int level) {
        for (int i=0; i<level; i++)
            System.out.print("  ");
        System.out.println("Product " + id);
    }
}
