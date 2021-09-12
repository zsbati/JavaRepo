public class Compute {

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        scientificCalculator.rest(6,5);
        scientificCalculator.add(1,3);
        scientificCalculator.subtract(5,13);
        ScientificCalculator.Calculator calculator = scientificCalculator.new Calculator();
        /** one can only instantiate the inner class from the existing instance of the outer class */
        calculator.add(4,55);
    }

}
