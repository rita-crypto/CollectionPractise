package setPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsExample {
    public static void main(String[] args) {
        Integer[] i = {3, 5, 9, 17, 23, 41};
        Integer[] j = {2, 5, 13, 17, 41, 51};
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(i));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(j));

        Set<Integer> unionSet = new HashSet<Integer>(set1);
        unionSet.addAll(set2);
        System.out.println("Union is:");
        System.out.println(unionSet);
        Set<Integer> interSectionSet = new HashSet<Integer>(set1);
        interSectionSet.retainAll(set2);
        System.out.println("Intersection is:");
        System.out.println(interSectionSet);
        Set<Integer> differenceSet = new HashSet<Integer>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference is:");
        System.out.println(differenceSet);
    }
}
