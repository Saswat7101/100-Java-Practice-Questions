// 43. Write a program to check if two arrays are disjoint sets.

import java.util.HashSet;

public class DisjointSetsCheck {
        public static void main(String[] args) {
        int[] set1 = { 1, 2, 3, 4, 5 };
        int[] set2 = { 4, 5, 6, 7, 8 };
        boolean areDisjoint = areDisjointSets(set1, set2);
        if (areDisjoint) {
            System.out.println("The sets are disjoint.");
        } else {
            System.out.println("The sets are not disjoint.");
        }
    }

    public static boolean areDisjointSets(int[] set1, int[] set2) {
        HashSet<Integer> elements = new HashSet<>();
        for (int num : set1) {
            elements.add(num);
        }
        for (int num : set2) {
            if (elements.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
