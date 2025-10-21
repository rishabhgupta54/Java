enum Priority implements Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1),
    DEFAULT();

    private final int level;

    // Parameterized constructor
    Priority(int level) {
        this.level = level;
    }

    // Default constructor
    Priority() {
        this.level = 0;
    }

    // Implementing interface method
    @Override
    public int getLevel() {
        return this.level;
    }
}
