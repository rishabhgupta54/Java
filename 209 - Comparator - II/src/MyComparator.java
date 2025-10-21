import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        // Reverse alphabetical order
        return -s1.compareTo(s2);
    }
}
