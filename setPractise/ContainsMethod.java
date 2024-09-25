package setPractise;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsMethod {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        set1.add(55);
        System.out.println("Set is: "+set1);
        System.out.println("Does Set contains '22'? "+set1.contains(22));
        System.out.println("Does Set contains '44'? "+set1.contains(44));
        System.out.println("Does Set contains '81'? "+set1.contains(81));
    }
}
