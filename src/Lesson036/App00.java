package Lesson036;

// LinkedList get( O(n) ), add( O(1) )
// ArrayList get( O(1) ), add ( O(n) )

// [8](List el2) [12](List el, e3) [](List) [] [] [] [] ... // 16 -> 30 O(1) - > O(n)


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App00 {
    int a;
    static String name = "text";


    public static void main(String[] args) {
        name += "txt";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        App00 app00 = (App00) o;

        if (a != app00.a) return false;
        return name != null ? name.equals(app00.name) : app00.name == null;

    }

    private Map<Object, Object> map;
    Iterator i = map.entrySet().iterator();

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
