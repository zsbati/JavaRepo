import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = x -> {
        return x % 2 == 0 ? x + 2 : x + 1;
    }; // Write your code here
}