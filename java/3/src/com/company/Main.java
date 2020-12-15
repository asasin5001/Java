package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class NumberAfterCcomparator implements Comparator<String> {
    public int compare(String a, String b) {
        Integer aI = Integer.parseInt(a.substring(1));
        Integer bI = Integer.parseInt(b.substring(1));
        return aI.compareTo(bI);
    }
}

public class Main {
    public static void helpForSort(String f) {
        char a = f.charAt(0);
        Character.toUpperCase(a);
        System.out.print(a + f.substring(1) + "\n");
    }

    public static void SortOnlyC(List<String> list)
    {
        list.stream().filter(a -> a.charAt(0) == 'c').sorted(new NumberAfterCcomparator()).map(String::toUpperCase).forEach(System.out::println);
    }


    public static strictfp void Task2(int n) {
        int[] arr = new int[n];
        Random rand = new Random();

        System.out.print("\n" + Arrays.stream(arr).map(a -> a = rand.nextInt(10)).average().getAsDouble());
        return;
    }

    public static StringBuilder Task3(StringBuilder smt)
    {
        for(int i = 0; i < smt.length(); i++)
        {
            if(smt.charAt(i) >= 'h' && smt.charAt(i) <= 't') {
                char gg = (char)(smt.charAt(i) - 32);
                smt.replace(i, i+1, String.valueOf(Character.toUpperCase(smt.charAt(i))));
            }
        }
        return smt;
    }

    public static void main(String[] args) {
	    List<String> myList = Arrays.asList("a1", "c89412896", "b1", "c1512", "c12190", "a1", "c5", "b1", "c0", "d1");
        SortOnlyC(myList);

        Task2(10);

        StringBuilder forTask3 = new StringBuilder("abcdfeghijklmnopqrstuvwxyz");
        forTask3 = Task3(forTask3);
    }
}
