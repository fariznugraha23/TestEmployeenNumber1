package com.company;
import java.util.*;
import java.util.Map.Entry;


public class Main{
    public static void main(String args[]) {
        int[] array = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.print("array = ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println();
        Map<Integer, Integer> kausKaki = new HashMap<>();
        for (int warnaKk : array) {
            Integer count = kausKaki.get(warnaKk);
            if (count == null) {
                kausKaki.put(warnaKk, 1);
            } else {
                kausKaki.put(warnaKk, ++count);
            }
        }
        int jumlah=0;
        Set<Entry<Integer, Integer>> entrySet = kausKaki.entrySet();
        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() >1 ) {
                if (entry.getValue()%2==0){
                    jumlah=jumlah+entry.getValue();
                }else {
                    jumlah=jumlah+(entry.getValue()-1);
                }
            }
        }
        int pasang;
        pasang = jumlah/2;
        System.out.println(pasang+" Pasang Kaos Kaki" );
    }
}