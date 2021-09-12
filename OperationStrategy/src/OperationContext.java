public class OperationContext {

    OperationStrategy strategy;

    public OperationContext(OperationStrategy strategy){ //constructor
        this.strategy = strategy;
    }

    public double executeOperation(double x, double y){
        return strategy.doOperation(x,y);
    }

}
