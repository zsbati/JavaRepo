public class Sigma2i implements  SingleQubitOperations{
    private Qubit qubit;

    private Sigma2i(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new Sigma2i();
        }
        return operation;
    }

    @Override
    public Qubit execute(Qubit qubit) {
        return new Qubit(qubit.b,-qubit.a);
    }
}
