public class Identity implements SingleQubitOperations {
    private Qubit qubit;

    private Identity(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new Identity();
        }
        return operation;
    }

    @Override
    public Qubit execute(Qubit qubit) {
        return qubit;
    }
}
