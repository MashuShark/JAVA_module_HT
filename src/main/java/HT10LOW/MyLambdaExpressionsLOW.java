package HT10LOW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyLambdaExpressionsLOW  {
    public static List<String> task1 (char symbol, List<String> stringList) {
        return stringList.stream()
                .filter(string -> string.length() > 1)
                .filter(string -> string.startsWith(String.valueOf(symbol)) && string.endsWith(String.valueOf(symbol)))
                .collect(Collectors.toList());
    }

    public static List<Integer> task2 (List<String> stringList){
        return stringList.stream()
                .sorted((str1, str2) -> str1.length() - str2.length())
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static List<String> task3 (List<String> stringList){
        return stringList.stream()
                .map(str -> String.valueOf(str.charAt(0)).concat(String.valueOf(str.charAt(str.length() - 1))))
                .collect(Collectors.toList());
    }

    public static List<String> task4 (int K, List<String> stringList){
        return stringList.stream()
                .filter(string -> string.length() == K)
                .filter(str -> str.matches("^.+?\\d$"))
                .collect(Collectors.toList());
    }

    public static List<String> task5 (List<Integer> integerList){
        return integerList.stream()
                .filter(integer -> integer%2 != 0)
                .map(integer -> integer.toString())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Hello");
        stringList1.add("qwerty");
        stringList1.add("asda");
        stringList1.add("asdfa");
        stringList1.add("as");
        stringList1.add("a");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Hello");
        stringList2.add("world");
        stringList2.add("!");
        stringList2.add("Good");
        stringList2.add("morning");
        stringList2.add("!");

        List<String> stringList3 = new ArrayList<>();
        stringList3.add("asd");
        stringList3.add("a");
        stringList3.add("basdw");

        List<String> stringList4 = new ArrayList<>();
        stringList4.add("8DC3");
        stringList4.add("4F");
        stringList4.add("B");
        stringList4.add("3S");
        stringList4.add("S3");
        stringList4.add("A1");
        stringList4.add("2A3G");
        stringList4.add("1B");

        List<Integer> intList5 = new ArrayList<>();
        intList5.add(1);
        intList5.add(2);
        intList5.add(3);
        intList5.add(4);
        intList5.add(5);
        intList5.add(6);

        System.out.println("My solution for task 1 " + task1('a', stringList1));
        System.out.println("My solution for task 2 " + task2(stringList2));
        System.out.println("My solution for task 3 " + task3(stringList3));
        System.out.println("My solution for task 4 " + task4(2, stringList4));
        System.out.println("My solution for task 5 " + task5(intList5));
    }
}
