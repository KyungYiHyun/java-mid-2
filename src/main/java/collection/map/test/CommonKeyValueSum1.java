package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("B",4);
        map2.put("C",5);
        map2.put("D",6);

        Set<String> ketSet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();

        ketSet1.retainAll(keySet2);
        Map<String,Integer> answer = new HashMap<>();
        for (String s : ketSet1) {
            answer.put(s,map1.get(s) + map2.get(s));
        }
        System.out.println(answer);


    }
}
