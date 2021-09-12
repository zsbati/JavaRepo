public class CarParts {

    /** Outer classes cannot be static, but nested/inner classes can be.
    *That basically helps you to use the nested/inner class without creating an
     *instance of the outer class. In simple terms, Java supports the declaration of
     *a class to be static only for the inner classes but not for the top level classes. */


    public static class Wheel { //inner class Wheel
        public Wheel() {
            System.out.println("Wheel created!"); //awkward, instead of a method, as usually ...
        }
    }

    public CarParts() { //constructor of CarParts
        System.out.println("Car Parts object created!"); //awkward, but works
    }

}
