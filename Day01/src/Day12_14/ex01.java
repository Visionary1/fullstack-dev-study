package Day12_14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex01 {

    public static void main(String[] args) {

        // Map 활용하기
        // Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
        
        // 성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
        // Iterator를 사용한다.
        // 출력 예시
        
        // {이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}

        Map<String, Character> map = new HashMap<>();
    
        map.put("aa", 'x');
        map.put("bb", 'x');
        map.put("cc", 'x');
        map.put("dd", 'x');
        map.put("ee", 'x');
        map.put("ff", 'x');

        Iterator<String> iter = map.keySet().iterator();

        while (iter.hasNext()) {
            String name = iter.next();

            if (name.startsWith("ee")) {
                map.put(name, 'O');
            }
        }

        System.out.println(map);
            
        }
    }
