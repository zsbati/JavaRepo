public class SingleQubitOperationFactory {


    public SingleQubitOperations getOperation(String operationType) {

        if (operationType.equalsIgnoreCase("identity")) {
            SingleQubitOperations operation = Identity.getInstance();
            return operation;
        }

        if (operationType.equalsIgnoreCase("negate")) {
            SingleQubitOperations operation = Negate.getInstance();
            return operation;
        }

        if (operationType.equalsIgnoreCase("hadamard")) {
            SingleQubitOperations operation = Hadamard.getInstance();
            return operation;
        }

        if (operationType.equalsIgnoreCase("sigma2i")) {
            SingleQubitOperations operation = Sigma2i.getInstance();
            return operation;
        }

        if (operationType.equalsIgnoreCase("sigma3")) {
            SingleQubitOperations operation = Sigma3.getInstance();
            return operation;
        }

        SingleQubitOperations operation = NullOperation.getInstance();
        return operation;
    }
    
}
