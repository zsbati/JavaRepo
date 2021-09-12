public class Sigma3 implements SingleQubitOperations{

    private Qubit qubit;

    private Sigma3(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new Sigma3();
        }
        return operation;
    }

    @Override
    public Qubit execute(Qubit qubit) {
        return new Qubit(qubit.a,-qubit.b);
    }
}
