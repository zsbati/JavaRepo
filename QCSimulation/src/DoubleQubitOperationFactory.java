public class DoubleQubitOperationFactory {

    public TwoQubitOperations getOperation(String operationType) {

        if (operationType.equalsIgnoreCase("ControlledNot")) {
            TwoQubitOperations operation = ControlledNot.getInstance();
            return operation;
        }



        TwoQubitOperations operation = DoubleNullOperation.getInstance();
        return operation;
    }


}
