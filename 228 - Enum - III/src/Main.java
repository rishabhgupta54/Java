/*
 * Enum
 *
 * Every enum implicitely contains values() method to list out  all the values present inside enum
 * value() methos is not present in java.lang.Enum and Object class. Enum keyword implicitely provide this method
 *
 * Inside enum, order of constant is important and we can represent this order by using ordinal() method
 * Ordinal value is zero based like array indexed
 */
public class Main {
    public static void main(String[] args) {
        Days[] days = Days.values();
        for (Days day : days) {
            System.out.println(day.ordinal() + " -> " + day);
        }
    }
}


