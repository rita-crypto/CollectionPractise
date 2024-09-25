package setPractise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddAll {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<Integer>();
        set1.add(11);
        set1.add(22);
        System.out.println("Set values: "+set1);
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(33);
        array1.add(44);
        array1.add(55);
        set1.addAll(array1);
        System.out.println("Set values after adding: "+set1);
    }
}
