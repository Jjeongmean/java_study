package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("부승관", 98);
        map.put("이석민", 87);
        map.put("권순영", 77);
        map.put("윤정한", 96);
        map.put("이지훈", 79);
        map.put("전원우", 85);

        System.out.println("총 Entry 수 " + map.size());
        System.out.println();

        //키로 값 얻기
        int value = map.get("부승관");
        System.out.println("부승관의 점수: " + value);

        value = map.get("이지훈");
        System.out.println("이지훈의 점수: " + value);

        System.out.println();


        //모든 Entry객체를 가져와 iterator객체로 변경
        Set<Map.Entry<String , Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + ":" + v);
        }

        System.out.println();
        map.remove("전원우");

        //hashMap 데이터를 모두 읽어오기
        //모든 key를 가져와 iterator객체로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
    }
}
