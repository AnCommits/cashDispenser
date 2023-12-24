package org.example;

import java.util.*;

public class CashDispenser {

    /**
     *
     * @param cash - value and number in a cashDispenser
     * @param sum - sum to withdraw
     * @return null, if not enough money in a cashdispenser
     */
    public static SortedMap<Integer, Integer> getCash(Map<Integer, Integer> cash, int sum) {
        SortedMap<Integer,Integer> result = new TreeMap<>(Comparator.reverseOrder());
        SortedMap<Integer, Integer> sortedCash = new TreeMap<>(Comparator.reverseOrder());
        sortedCash.putAll(cash);
        for (Map.Entry<Integer, Integer> entry : sortedCash.entrySet()) {
            int numberOfBankNotesToWithdraw = sum / entry.getKey();
            if (entry.getValue() < numberOfBankNotesToWithdraw) {
                numberOfBankNotesToWithdraw = entry.getValue();
            }
            sum -= numberOfBankNotesToWithdraw * entry.getKey();
            result.put(entry.getKey(), numberOfBankNotesToWithdraw);
            if (sum == 0) {
                return result;
            }
        }
        return null;
    }
}
