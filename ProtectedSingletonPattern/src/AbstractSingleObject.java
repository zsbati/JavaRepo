public abstract class AbstractSingleObject {

    /** make the constructor abstract so that this class cannot be instantiated
     * and, instead of private constructor, have a protected one. Had the class not been abstract,
     * one could instantiate it within the subclasses
     * protected: can be subclassed; private: can't be subclassed. */

    protected  AbstractSingleObject(){}

    public void doSomething(){
        System.out.println("I'm doing whatever I'm told to.");
    }



}
