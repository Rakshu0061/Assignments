package collection.programs;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] s={"a","e","b"};
        List l= Arrays.asList(s);

        System.out.println(l);
        s[0]="k";
        System.out.println(l);

        l.set(1,"P");
        for (String s1:s)
        {
            System.out.println(s1);
        }

    }
}
