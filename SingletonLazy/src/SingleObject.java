public class SingleObject {


    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //create an object of SingleObject
    private static SingleObject instance;



    //Get the only object available
    public static SingleObject getInstance(){
        if (instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("I'm doing whatever I'm told to.");
    }

}
