import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator = (x, y) -> {
        if (x == y) {
            return x;
        } else {
            long prod = 1;
            for (int i = 0; i <= y - x; i++) {
                prod *= (x + i);
            }
            return prod;
        }
    };
}