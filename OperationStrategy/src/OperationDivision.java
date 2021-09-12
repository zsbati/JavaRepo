public class OperationDivision implements OperationStrategy{

    @Override
    public double doOperation(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        return 9000000000000000000.0;
    }
}
