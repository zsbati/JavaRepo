public class SingleObjectInstantiation {

    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //do something, whatever you are told to
        object.doSomething();
    }

}
