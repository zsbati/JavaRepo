class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("String is null");
        }
    }
}