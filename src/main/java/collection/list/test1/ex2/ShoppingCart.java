package collection.list.test1.ex2;

import collection.list.ArrayList;

public class ShoppingCart {

    ArrayList<Item> items = new ArrayList<>();
    int total = 0;
    public void addItem(Item item1) {
        items.add(item1);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getTotalPrice();
            System.out.println("상품명: " + items.get(i).getName() + ", 합계: " + items.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합: " + total);
    }
}

