package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    Map<String, Member> map = new HashMap<>();
    public void save(Member member1) {
        map.put(member1.getId(),member1);
    }

    public Member findById(String id1) {
       return map.get(id1);
    }

    public Member findByName(String name) {
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            if(map.get(s).getName().equals(name)){
                return map.get(s);
            }
        }
        return null;
    }

    public void remove(String id1) {
        map.remove(id1);
    }
}
