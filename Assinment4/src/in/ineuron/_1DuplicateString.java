package in.ineuron;

import java.util.LinkedHashSet;
import java.util.Scanner;

// WAP to remove Duplicates from a String.(Take any String ex with duplicates
// character)
public class _1DuplicateString {
    public static void main(String[] args) {
        String s = "Bakkamunthala Divya";
        // output: [B, a, k, m, u, n, t, h, l, D, i, v, y]
        char[] a = s.toCharArray();
        LinkedHashSet<Character> hash = new LinkedHashSet<>();
        for (int j = 0; j < a.length; j++) {
            if (a[j] != ' ')
                hash.add(a[j]);
        }
        System.out.println(hash);
    }

}