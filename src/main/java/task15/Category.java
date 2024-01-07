package task15;

import java.util.Arrays;

public class Category {
    String name;
    Product[] products;

    public Category() {
    }

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }

    Product[] products1 = new Product[]{new Product("Product1", 1_000_00, 3),
            new Product("Product2", 2_000_00, 4),
            new Product("Product3", 4_000_00, 5)};



}


