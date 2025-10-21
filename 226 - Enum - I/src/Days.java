// Enum declaration
enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

/*
 * Internally, enum Days is represented as:
 *
 * class Days {
 *     public static final Days SUNDAY = new Days();
 *     public static final Days MONDAY = new Days();
 *     public static final Days TUESDAY = new Days();
 *     public static final Days WEDNESDAY = new Days();
 *     public static final Days THURSDAY = new Days();
 *     public static final Days FRIDAY = new Days();
 *     public static final Days SATURDAY = new Days();
 * }
 */
