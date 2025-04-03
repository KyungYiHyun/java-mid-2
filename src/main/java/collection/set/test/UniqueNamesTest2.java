package collection.set.test;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        LinkedHashSet<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (int n2 : set){
            System.out.println(n2);
        }
    }
}