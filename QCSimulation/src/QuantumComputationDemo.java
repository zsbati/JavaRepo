public class QuantumComputationDemo {

    public static void main(String[] args) {
        SingleQubitOperations operation;
        SingleQubitOperationFactory singleOperationfactory = new SingleQubitOperationFactory();
        Qubit q = Qubit.qubit(1.0, 0.0); //to normalize,if not zero.
        Qubit q1;

        operation = singleOperationfactory.getOperation("identity");
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b);

        operation = singleOperationfactory.getOperation("negate");
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b);

        operation = singleOperationfactory.getOperation("hadamard");
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b);

        q1 = operation.execute(q1); //hadamard again, it's its own inverse.
        System.out.println(q1.a + " " + q1.b);

        operation = singleOperationfactory.getOperation("sigma2i");
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b);

        operation = singleOperationfactory.getOperation("sigma3");
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b);

        operation = singleOperationfactory.getOperation("kutyaszar"); //doesn't exist
        q1 = operation.execute(q);
        System.out.println(q1.a + " " + q1.b); //must give 0.0 0.0

        DoubleQubit dq = DoubleQubit.doubleQubit(0,1,1,0);
        DoubleQubit dq1;
        TwoQubitOperations twoQubitOperations;
        DoubleQubitOperationFactory doubleQubitOperationFactory = new DoubleQubitOperationFactory();

        twoQubitOperations = doubleQubitOperationFactory.getOperation("ControlledNot");
        dq1 = twoQubitOperations.execute(dq);
        System.out.println(dq1.a + " " + " " + dq1.b +" " + dq1.c +" " + dq1.d);



    }
}
