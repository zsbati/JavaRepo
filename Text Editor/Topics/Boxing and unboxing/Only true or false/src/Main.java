
class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if (b != null) {
            return (boolean) b;
        } else {
            return false;
        }
    }
}