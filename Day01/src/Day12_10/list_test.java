package Day12_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class list_test {

    public static void main(String[] args) {

        /*
        List<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(5);

        System.out.println(list1);
        System.out.println(list1.add(8));
        

        System.out.println(list1.size());

        System.out.println(list1.toString());


        // List interface implementation

        List<Integer> list2 = new LinkedList<>();

        list2.add(10);
        list2.addAll(list1);

        System.out.println(list2);

        // change value
        // list2 10 => 20
        //list2.set(0, 200); => returns previous value

        System.out.println(list2.set(0, 200)); // will return an og value of 10
        System.out.println(list2);

        // delete vaue
        // list2 1 delete

        Integer deleted = list2.remove(1);
        System.out.println(deleted);
        System.out.println(list2);

        List<String> strList = new ArrayList<>();
        strList.add("abc");
        strList.add("qwer");

        System.out.println(strList);
        strList.remove("qwer");
        System.out.println(strList);


        System.out.println(list2);
        Integer value = 200;
        list2.remove(value);

        System.out.println(list2);

        // clear all
        // list2.clear();
        */

        // 1. List 만들기
        // 리스트에 주어진 값들을 넣고 출력하세요.
        // 3, 8, 9, 4, 2, 1, 7, 5
        // 출력 예시

        /*
        List<Integer> list1 = new ArrayList<>();
        
        int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};

        for (int i = 0; i < numbers.length; i++) {
            list1.add(numbers[i]);
        }

        System.out.println(list1);

        // 한번에 add 하는법
        // 이러면 값 수정이 안댐
        //List<Integer> list2 = Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5);

        // 요러면 값 수정도 가능

        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 8, 9, 4, 2, 1, 7, 5));
        list2.add(100);
        System.out.println(list2);


        // [3, 8, 9, 4, 2, 1, 7, 5]
        // 2. 값 수정하기
        // List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
        // 출력 예시

        list1.set(3, 6);

        System.err.println(list1);
        
        // [3, 8, 9, 6, 2, 1, 7, 5]
        // 3. 값 삭제하기
        // List에서 8과 7을 삭제하고 전체를 출력하세요.
        // 출력 예시
        // [3, 9, 6, 2, 1, 5]

        list1.remove(1);
        list1.remove(5);
        System.out.println(list1);


        List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grape");
		
		// 1. index 기반으로 출력
		// 문제점: 요소를 중간에 제거하면 문제가 생긴다.(사이즈가 변경이 되기 때문에)
		System.out.println("### 1. for문");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i)); // apple banana grape
			
			// 만약에 b로 시작하면 요소 제거
			String fruit = strList.get(i);
			if (fruit.startsWith("b")) {
				strList.remove(i);
				i--; // 삭제가 될 때 한번 더 돌리기 위해 i-- 시킨다.
			}
		}
		
		// 2. Iterator 사용하기
		// 요소를 중간에 삭제해도 된다.
		System.out.println("### 2. Iterator");
		
		Iterator<String> iter = strList.iterator();
		while (iter.hasNext()) {
			String fruit = iter.next(); // next() 호출할 때마다 소비가 되므로 반복문에서 한번만 수행하는 것이 좋다.
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				iter.remove(); // 리스트에서 삭제가 아니라 반드시 iterator의 remove로 삭제해야 한다.
			}
		}
		
		System.out.println(strList);
		
		// 3. 향상된 for문으로 돌리기
		// 문제점: 자바버전마다 다르다. 중간에 삭제하지 않는게 좋다.
		System.out.println("### 3. 향상된 for문");
		for (String fruit : strList) {
			System.out.println(fruit);
			
			if (fruit.startsWith("b")) {
				strList.remove(fruit);
			}
		}
        */

        // 1. List 만들기
        // 리스트에 주어진 값들을 넣으세요.
        // 20 3 5 84 17
        // 2. 최소값 구하기
        // List에서 가장 작은 값을 출력하세요.
        // for문을 사용하세요.(향상된 for문 X)
        // 출력 예시
        // 3

        /*
        List<Integer> list1 = new ArrayList<>(Arrays.asList(20, 3, 5, 84, 17));
        
        int min = list1.get(0);

        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j) < min) {
                min = list1.get(j);
            }
        }

        System.out.println(min);
        
        
        // 3. 합계 구하기
        // List 요소들의 총 합계를 구하세요.
        // Iterator를 사용하세요.
        // 출력 예시
        // 129

        Iterator<Integer> listAsIter = list1.iterator();

        int sum = 0;
        for (Integer integer : list1) {
            sum += integer;
        }

        System.out.println(sum);

        // if contains 
        // list1.contains(5) //

        // sort
        list1.sort(Comparator.naturalOrder());
        list1.sort(Comparator.reverseOrder());

        // check if list is empty

        list1.isEmpty();
        */

        // 1. 체조 경기 평균 점수
        // 체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
        // 최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
        // for문으로 구현할 것
        
        // [8, 7, 6, 10, 9, 4]
        // 출력 예시
        
        // 최고점과 최저점을 제외한 평균 점수는 7.5

        List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
        
        list1.sort(Comparator.naturalOrder());
        int max = list1.get(0);

        list1.sort(Comparator.reverseOrder());
        int min = list1.get(0);

        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }

        sum = sum - min - max;
        System.out.println((double) sum / (list1.size() - 2));

        // 2. 회원 추가하기
        // 회원관리 리스트를 만든다.
        
        // [우솝, 루피, 상디, 나미, 로빈]
        // 새로 입력할 이름을 기존 리스트에 추가한다.
        // 만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
        // (새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)

        List<String> accounts = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
        List<String> newAccounts = new ArrayList<>(Arrays.asList("찬섭", "루피", "쵸파", "로빈", "루피"));

        for (int i = 0; i < newAccounts.size(); i++) {
            int count = 1;
            String newMember = newAccounts.get(i);

            while (accounts.contains(newMember)) {
                newMember = newAccounts.get(i) + count;
                count++;
            }
            accounts.add(newMember);
        }

        // for (int index = 0; index < newAccounts.size(); index++) {
        //     String newMember = newAccounts.get(index);

        //     if (accounts.contains(newMember)) {
        //         String name = newAccounts.get(index) + count;

        //         // check if same count exists
        //         if (accounts.contains(name)) {
        //             count++;
        //             index--; // 이름 + 번호로 다시 검사하기 위해서
        //             continue;
        //         }

        //         accounts.add(name);
        //         count = 1;

        //     } else {
        //         accounts.add(newAccounts.get(index));
        //     }
        // }

        // for (int i = 0; i < tempAccount.length; i++) {
        //     if (accounts.contains(tempAccount[i])) {
        //         accounts.add(tempAccount[i] + i);
        //     } else {
        //         accounts.add(tempAccount[i]);
        //     }
        // }

        System.out.println(accounts);

        
        // 보람
        // 루피
        // 쵸파
        // 로빈
        // 루피
        // 출력 예시
        
        // [우솝, 루피, 상디, 나미, 로빈, 보람, 루피1, 쵸파, 로빈1, 루피2]
    }

    /*
    recursive function
    재귀 함수

    a() {
        return ();
    }

    팩토리얼, 피보나치


    Tree
    이진 탐색 트리
    AVL 트리 
    B 트리
    레드 블랙 트리

    트리 순회
    - 전위 순회
    - 중위 순회
    - 후위 순회

    그래프
    - 깊이 우선 탐색
    - 너비 우선 탐색

    리스트
    - linked list => double linked list
    - stack => LIFO way, POP, PUSH
    - queue => FIFO way


    */

}
