public class DoingOperations {

    public static void main(String[] args) {
        OperationContext add = new OperationContext(new OperationAdd()); //the 2nd new!!!!!!!!!
        //OperationContext add = new OperationAdd(); does not work !!!!!!!!!!!!!!!!!!!
        System.out.println("1+5=" + add.executeOperation(1, 5));

        OperationContext subtract = new OperationContext(new OperationSubtract());
        System.out.println("2-9=" + subtract.executeOperation(2, 9));

        OperationContext multiply = new OperationContext(new OperationMultiply());
        System.out.println("8*1167.89=" + multiply.executeOperation(8, 1167.89));

        OperationContext division = new OperationContext(new OperationDivision());
        System.out.println("102.52346%9.81=" + division.executeOperation(102.52346, 9.81));

    }

}
