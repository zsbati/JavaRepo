public class Hadamard implements  SingleQubitOperations{

    private Qubit qubit;
    private Hadamard(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new Hadamard();
        }
        return operation;
    }


    @Override
    public Qubit execute(Qubit qubit) {
        return new Qubit((qubit.a+qubit.b)/Math.sqrt(2.0),(qubit.a-qubit.b)/Math.sqrt(2.0));
    }

}
