public abstract class Shape implements Cloneable{

    /** Cloneable interface : Cloneable interface is present in java.lang package.
     * There is a method clone() in Object class. A class
     * that implements the Cloneable interface indicates that it is legal
     * for clone() method to make a field-for-field copy of instances
     * of that class. */

    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    public Object clone(){
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
