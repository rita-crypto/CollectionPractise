package setPractise;

import java.util.HashSet;
import java.util.Set;

public class ContainsAll {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        System.out.println("set1 is: "+set1);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(11);
        set2.add(22);
        System.out.println("Does set1 contains set2?: "+set1.containsAll(set2));
        Set<Integer> set3 = new HashSet<Integer>();
        set3.add(11);
        set3.add(25);
        System.out.println("Does set1 contains set3?: "+set1.containsAll(set3));

    }
}
