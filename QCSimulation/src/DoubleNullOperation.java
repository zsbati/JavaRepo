public class DoubleNullOperation implements TwoQubitOperations{
    private DoubleQubit doubleQubit;

    private DoubleNullOperation(){

    }

    //create an object of SingleObject
    private static TwoQubitOperations operation;



    //Get the only object available
    public static TwoQubitOperations getInstance(){
        if (operation == null){
            operation = new DoubleNullOperation();
        }
        return operation;
    }

    @Override
    public DoubleQubit execute(DoubleQubit doubleQubit) {
        return new DoubleQubit(0.0,0.0, 0.0, 0.0);
    }
}
