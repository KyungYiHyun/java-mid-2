package collection.list.test1.ex1;

import collection.list.ArrayList;

public class ArrayEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] students = {90, 80, 70, 60, 50};
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
