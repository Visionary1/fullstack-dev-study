package Day12_13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {
        // set
        // can't be duplicated
        // no orders, not index-based

        Set<Integer> set1 = new HashSet<>();
        
        set1.add(3);
        set1.add(2);
        set1.add(1);

        System.out.println(set1.add(1)); // can't add duplicated value
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(11);
        set2.addAll(set1);

        System.out.println(set2);
        System.out.println(set2.contains(10));

        // set2 set1을 차집합
        set2.removeAll(set1);
        System.out.println(set2);

        // TreeSet

        Set<String> set3 = new TreeSet<>();
        set3.add("c");
        set3.add("b");
        set3.add("a");

        System.out.println(set3);

        // set3 for 문 doesnt work since it lacks index

        // 1. Iterator

        Iterator<String> iter = set3.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // 2. for

        for (String string : set3) {
            System.out.println(string);
        }
    }
}
