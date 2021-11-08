package Practice;

class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;
    static final int MAX = 5;

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        // do not forget to check the number of cats
        counter++;
        if (counter > MAX) {
            System.out.println("You have too many cats");
        }

    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}