package Hash;

import java.util.HashMap;
import java.util.Map;

class Product {
    private String name;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class LearnHashMap {
    public static void main(String[] args) {
        Product ev = new Product("Tesla", "Tesla Model S, is an electric vehicle.");
        Product ic = new Product("Porsche", "Porsche 911, is not an electric vehicle.");

        Map<String, Product> productMap = new HashMap<>();

//        put key
        productMap.put(ev.getName(), ev);
        productMap.put(ic.getName(), ic);

        System.out.println(productMap.get("Tesla").getDescription());
        System.out.println(productMap.get("Porsche").getDescription());

//        contains key
        System.out.println(productMap.containsKey("Tesla"));

//        iterating keys
        for (String key : productMap.keySet()) {
            System.out.println(productMap.get(key).getName());
        }

//        iterate entries
        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getValue().getName());
        }

//        iterate values
        for (Product product : productMap.values()) {
            System.out.println(product.getName());
        }

//        remove key
        Product tesla = productMap.remove("Tesla");
        System.out.println(tesla.getName() + " was removed.");
    }
}
