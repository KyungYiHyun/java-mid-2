package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //코드 작성
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(union);
        System.out.println(intersect);
        System.out.println(difference);
    }
}
