class Predicate {
    // Write a lambda expression here
    public static final TernaryIntPredicate ALL_DIFFERENT = new TernaryIntPredicate() {
        @Override
        public boolean test(int a, int b, int c) {
            return !(a == b || b == c || a == c);
        }
    };

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int a, int b, int c);
    }
}