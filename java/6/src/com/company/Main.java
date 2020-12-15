package com.company;

import java.util.SplittableRandom;

public class Main {
    public static int task1(String str) {
        char[] chStr = str.toCharArray();
        int ans = 0;
        int max = 0;

        for(int i = 0; i < str.length(); i++) {
            if(chStr[i] >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                ans++;
            else if(max < ans) {
                max = ans;
                ans = 0;
            }

        }

        return ans;
    }

    public static int task2(int num) {
        int ans = num;
        while (ans > 9 ) {
            int t = 0;
            while(ans > 0) {
                t += ans%10;
                ans /= 10;
            }
            ans = t;
        }

        return ans;
    }

    public static strictfp String task3(int seconds) {
        if(seconds > 359999)
            return "ERROR";

        int hh = 0, mm = 0, ss = seconds;

        hh = ss/60/60;
        mm = (ss/60 - hh*60);
        ss = ss - hh*60*60 - mm*60;

        String time = hh + ":" + mm + ":" + ss;

        return time;
    }

    public static boolean hasNONELetters(String str) {
        char[] blacklist = new char[]{'l'};

        for(int i = 0; i < str.length(); i++) {
            for (char c : blacklist) {
                if (str.charAt(i) == c || str.charAt(i) == Character.toUpperCase(c))
                    return false;
            }
        }

        return true;
    }

    public static int[] findMultiples(int n, int num) {
        int[] multiples = new int[n];

        for(int i = 0; i < n; i++) {
            multiples[i] = num*(i+1);
        }

        return multiples;
    }

    public static String reverse(String str) {
        StringBuilder rev = new StringBuilder();
        int i = 0;
        int j = str.length() - 1;

        while (i < str.length()) {
          if(str.charAt(i) == ' ') {
               rev.append(' ');
               i++;
           }
           else {
               if(str.charAt(j) == ' ')
                   j--;
               else {
                   rev.append(str.charAt(j));
                   j--;
                   i++;
               }
           }
        }

        return rev.toString();
    }

    public static void main(String[] args) {
       int t1 = task1("asd, asipfpsajp, qwqe, sads, uodaf    asdjassg,123812 os");
       int t2 = task2(1245345);
       String t3 = task3(359999);
       boolean t4 = hasNONELetters("ewfe3fderwfwrgqfdfsaf");
       int[] t5 = findMultiples(3, 4);
       String t6 = reverse("Don't worry, be happy!");
    }
}
