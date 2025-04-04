package collection.map.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String,Integer> map = new HashMap<>();
        for (String[] strings : productArr) {
            map.put(strings[0],Integer.parseInt(strings[1]));
        }

        // Map의 모든 데이터 출력 - 코드 작성
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("제품: " + next + ", 가격: " + map.get(next));
        }

    }
}