package collectionpkg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {

        // Map 객체 생성
        Map<String, Integer> map =new HashMap<>();

        // 이름이 담긴 문자열 배열 생성
        String[] names = {"홍길동", "김유신", "이순신", "강감찬", "김유신"};
        // 숫자가 담긴 정수 배열 생성
        int[] nums = {1234,4567,2350,9870,2345};

        // Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
        // put(object key, object value)
        for(int i=0;i<names.length;i++) {
            map.put(names[i], nums[i]);
        }

        // 출력
       // System.out.println(map);
       // System.out.println("홍길동 번호 :" + map.get("홍길동"));
       // System.out.println("이순신 번호 :" + map.get("이순신"));
       // System.out.println("김유신 번호 :" + map.get("김유신"));
        
        // keySet()
        Set<String> keys = map.keySet();
        for(String key :keys) {
        	System.out.print(key + " : "+map.get(key));
        }
        
        // values()
        Collection<Integer> values = map.values();
        for(int i:values) {
        	System.out.println(i);
        }
        
        //entry() , Map.enety -> getKey(),getValue()
        Set entry = map.entrySet();
        for(Object o : entry) {
        	Map.Entry<String, Integer> m = (Map.Entry<String, Integer>)o;
        	System.out.println("key="+m.getKey() +",values" + m.getValue() );
        }
    }

}