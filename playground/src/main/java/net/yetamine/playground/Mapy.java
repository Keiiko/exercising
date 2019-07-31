package net.yetamine.playground;

import java.util.HashMap;
import java.util.Map;

public class Mapy {
    public static void main(String[] args) {
        final Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "ichi");
        numbers.put(2, "nii");
        numbers.put(3, "san");
        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());


    }
}
