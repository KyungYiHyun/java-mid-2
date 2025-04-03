package collection.set.test;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        TreeSet<Integer> set = new TreeSet<>(List.of(inputArr));

        for (int n2 : set){
            System.out.println(n2);
        }
    }
}