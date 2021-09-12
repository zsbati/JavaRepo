public class Negate implements SingleQubitOperations{

    private Qubit qubit;

    private Negate(){

    }

    //create an object of SingleObject
    private static SingleQubitOperations operation;



    //Get the only object available
    public static SingleQubitOperations getInstance(){
        if (operation == null){
            operation = new Negate();
        }
        return operation;
    }

    @Override
    public Qubit execute(Qubit qubit) {
        return new Qubit(qubit.b,qubit.a);

    }
}
