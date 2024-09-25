package setPractise;

import java.util.HashSet;
import java.util.Set;

public class ClearAll {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        System.out.println("Set: "+set1);
        set1.clear();
        System.out.println("The final set is: "+set1);
    }
}
