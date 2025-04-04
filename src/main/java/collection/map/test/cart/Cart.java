package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Product product;
    private int count;
    private Map<Product,Integer> map = new HashMap<>();

    public Cart() {
    }

    public Cart(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public void add(Product product, int i) {
        map.put(product,map.getOrDefault(product,0) + i);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        Set<Map.Entry<Product, Integer>> entries = map.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }

    }


    public void minus(Product product, int i) {
        if (map.get(product) <= i){
            map.remove(product);
        } else {
            map.put(product, map.get(product) - i);
        }
    }
}
