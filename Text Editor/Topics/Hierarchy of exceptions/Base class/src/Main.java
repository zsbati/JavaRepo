// update the class
class MyException extends Throwable {
    String message;

    public MyException(String message) {
        this.message = message;
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException instanceof Throwable);
    }
}