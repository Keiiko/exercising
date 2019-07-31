package net.yetamine.playground;

import java.util.*;

public class GenMeth {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(4);
        printAll(list);

        final List<Boolean> list2 = new ArrayList<>();
        list2.add(true);
        list2.add(false);
        list2.add(true);
        printAll(list2);

        final List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        printAll(list3);

        List<Integer> unmodif = Collections.unmodifiableList(list); //nejde zmenit

        //final List<Number> numbers = Arrays.asList(1.0, 1.2, 1.9, 2.4, 3.5);
        final List<Number> numbers = List.of(1.0, 1.2, 1.9, 2.4, 3.5);
        final Set<Integer> integers = Set.of(1, 2, 9, 4, 5);
        System.out.println(sumIt(numbers));
        System.out.println(sumIt(integers));

        final List<String> strings = new ArrayList<>();
        fillMeUp(strings, "|-|", 10);
        printAll(strings);

        fillMeUp(list, 6, 3);
        printAll(list);

    }

    private static <T> void fillMeUp(Collection<T> coll, T value, int count) {
        for(int i=0; i < count; i++) {
            coll.add(value);
        }
    }

    private static double sumIt(Iterable<? extends Number> iterable) {
        double sum = 0;
        for (Number number : iterable) {
            sum += number.doubleValue();
        }
        return sum;
    }

    private static void printAll(Iterable<?> iterable) {
        for (Object item : iterable) {
            System.out.println(item);
        }
    }
}
