public class ControlledNot implements TwoQubitOperations{
    private DoubleQubit doubleQubit;
    private ControlledNot(){

    }

    //create an object of SingleObject
    private static TwoQubitOperations operation;



    //Get the only object available
    public static TwoQubitOperations getInstance(){
        if (operation == null){
            operation = new ControlledNot();
        }
        return operation;
    }

    @Override
    public DoubleQubit execute(DoubleQubit dq) {
        return new DoubleQubit(dq.a,dq.b,dq.d,dq.c);
    }
}
