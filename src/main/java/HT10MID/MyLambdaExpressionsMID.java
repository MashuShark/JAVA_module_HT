package HT10MID;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyLambdaExpressionsMID {
    public static List<String> task6(List<Integer> integerList, List<String> stringList) {
        return integerList.stream()
                .map(integer -> stringList.stream()
                        .filter(s -> s.length() == integer && Character.isDigit(s.charAt(0)))
                        .findAny()
                        .orElse("Not found")
                )
                .collect(Collectors.toList());
    }

    public static List<Integer> task7(int K, List<Integer> integerList) {
        return integerList.stream()
                .filter(integer -> integer%2 == 0 ^ integerList.indexOf(integer) > K-1)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

    }
    
    public static List<Integer> task8 (int D, int K, List<Integer> integerList){
        return integerList.stream()
                .filter(integer -> integer > D || integerList.indexOf(integer) >= K)
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

    }

    public static List<String> task9 (List<String> stringList){
        return stringList.stream()
                .collect(
                        Collectors.toMap(
                                str -> Character.toString(str.charAt(0)),
                                Function.identity(),
                                (str1, str2) -> str1 + str2))
                .entrySet().stream()
                .map(entry -> entry.getValue().length() + "-" + entry.getKey())
                .collect(Collectors.toList());
   }

    public static List<String> task10 (List<String> stringList){
        return stringList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .map(String::toUpperCase)
                .map(str -> Character.toString(str.charAt(str.length() - 1)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> intList6 = new ArrayList<>();
        intList6.add(1);
        intList6.add(3);
        intList6.add(4);

        List<String> strList6 = new ArrayList<>();
        strList6.add("1aa");
        strList6.add("aaa");
        strList6.add("1");
        strList6.add("a");

        List<Integer> intList7 = new ArrayList<>();
        intList7.add(1);
        intList7.add(2);
        intList7.add(3);
        intList7.add(4);
        intList7.add(5);
        intList7.add(6);
        intList7.add(7);
        intList7.add(8);
        intList7.add(9);

        List<Integer> intList8 = new ArrayList<>();
        intList8.add(-10);
        intList8.add(3);
        intList8.add(-3);
        intList8.add(4);
        intList8.add(55);
        intList8.add(6);

        List <String> strList9 = new ArrayList<>();
        strList9.add("ABD");
        strList9.add("A");
        strList9.add("BCD");
        strList9.add("D");

        List <String> strList10 = new ArrayList<>();
        strList10.add("asnsbiu");
        strList10.add("asdsad");
        strList10.add("asnsb");
        strList10.add( "asdf");
        strList10.add("asdfb");
        strList10.add("as");
        strList10.add("a");
        strList10.add("aop");

        System.out.println("My solution for task 6 " + task6(intList6, strList6));
        System.out.println("My solution for task 7 " + task7(5, intList7));
        System.out.println("My solution for task 8 " + task8(3, 4,  intList8));
        System.out.println("My solution for task 9 " + task9(strList9));
        System.out.println("My solution for task 10 " + task10(strList10));

    }
}