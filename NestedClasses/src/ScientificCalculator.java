public class ScientificCalculator { //outer class

    private Calculator calculator = new Calculator(); //give a simple calculator to the sci.

    public ScientificCalculator(){
    }

    public void rest(int n, int m) {
        System.out.println(n % m);
    }

    public void add(int i, int j) { //delegation, composition;
        calculator.add(i,j);
    }

    public void subtract(int i, int j){ //delegation, composition;
        calculator.subtract(i,j);
    }


    class Calculator { //inner class
        public void add(int x, int y) {
            System.out.println(x + y);
        }

        public void subtract(int x, int y) {
            System.out.println(x - y);
        }

    }

}
