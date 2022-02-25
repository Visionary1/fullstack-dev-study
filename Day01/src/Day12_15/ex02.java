package Day12_15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Day12_10.list_test;

public class ex02 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);

        int number = 0;

        while (number != 4) {
            System.out.println("1:입력 2:출력 3:삭제 4:종료");

            number = scan.nextInt();

            if (number == 1) {

                System.out.print("이름: ");
                String name = scan.next();

                System.out.print("생년월일: ");
                String birth = scan.next();

                people.add(new Person(name, birth));

            } else if (number == 2) {

                // for (Person person : people) {
                //     System.out.println(person.getName());
                // }

                // Iterator<Person> iter = people.iterator();

                // while (iter.hasNext()) {
                //     Person p = iter.next();
                //     System.out.println(p.getName());
                // }

                // after @override
                System.out.println(people);

            } else if (number == 3) {

                System.out.print("삭제할 사람 이름을 입력하세요: ");

                Iterator<Person> iter = people.iterator();

                while (iter.hasNext()) {
                    Person p = iter.next();

                    if (p.getName().equals(scan.next())) {
                        // people.remove(p);

                        // self-destruct ?
                        iter.remove();
                    }
                }

                // for (Person person : people) {
                //     if (person.getName().equals(scan.next())) {

                //         person.remove();
                // doesn't work so, use iterator

                //         //people.remove(new Person(person.getName(), person.getBirth()));
                //     }
                // }

                // 홍당무 마켓 과제 ~

            }
        }

        scan.close();
    }
}
