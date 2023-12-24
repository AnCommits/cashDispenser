package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<Integer, Integer> cash = new HashMap<>();
        cash.put(500,8);
        cash.put(100, 9);
        cash.put(1000, 2);
        cash.put(50,6);
        Map<Integer, Integer> result = CashDispenser.getCash(cash, 5650);
        System.out.println(result);
    }
}
