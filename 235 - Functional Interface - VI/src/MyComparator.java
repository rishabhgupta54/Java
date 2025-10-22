import java.util.Comparator;

// Traditional Comparator implementation
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 > i2)
            return -1; // for descending order
        else if (i1 < i2)
            return 1;
        else
            return 0;
    }
}
