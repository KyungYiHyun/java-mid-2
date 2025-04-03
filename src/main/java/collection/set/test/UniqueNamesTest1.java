package collection.set.test;


import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        HashSet<Integer> set = new HashSet<>();
        for(int n : inputArr){
            set.add(n);
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}