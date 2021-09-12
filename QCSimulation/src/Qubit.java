public class Qubit {
    double a;
    double b;

    public Qubit(double a, double b){
        this.a = a;
        this.b = b;
    }
    public static Qubit qubit(double a, double b){
        if (a != 0 || b!= 0){
            double norm = Math.sqrt(a*a+b*b);
        a = a/norm;
        b = b/norm;

        }
        return new Qubit(a,b);
    }
}
