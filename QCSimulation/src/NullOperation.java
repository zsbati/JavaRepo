public class NullOperation implements SingleQubitOperations{
    private Qubit qubit;

    private NullOperation(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new NullOperation();
        }
        return operation;
    }

    @Override
    public Qubit execute(Qubit qubit) {
        return new Qubit(0.0,0.0);
    }
}
