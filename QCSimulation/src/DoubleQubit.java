public class DoubleQubit {
    double a;
    double b;
    double c;
    double d;

    public DoubleQubit(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public static DoubleQubit doubleQubit(double a, double b, double c, double d){

        if (a != 0 || b != 0 || c != 0 || d != 0){

            double norm = Math.sqrt(a*a+b*b+c*c+d*d);
            a = a/norm;
            b = b/norm;
            c = c/norm;
            d = d/norm;
        }

        return new DoubleQubit(a,b,c,d);
    }
}
