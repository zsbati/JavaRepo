import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // implement me
        String s1 = f1.getParent();
        String s2 = f2.getParent();
        return s1.equals(s2);
    }
}