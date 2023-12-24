package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class CashDispenserTest {

    @Test
    void getCash() {
        Map<Integer, Integer> cash = new HashMap<>();
        cash.put(500,8);
        cash.put(100, 9);
        cash.put(1000, 2);
        cash.put(50,6);

        SortedMap<Integer, Integer> expected = new TreeMap<>(Comparator.reverseOrder());
        expected.put(1000, 2);
        expected.put(500, 7);
        expected.put(100, 1);
        expected.put(50, 1);
        Map<Integer, Integer> result = CashDispenser.getCash(cash, 5650);
        Assertions.assertEquals(expected, result);

        Assertions.assertNull(CashDispenser.getCash(cash, 7650));
    }
}
