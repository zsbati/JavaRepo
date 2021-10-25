public class MyCalculator {
    
    public long power(int n1, int n2) throws Exception{
        if (n1 == 0 && n2 == 0){
            throw new Exception("n and p should not be zero.");
        } else if (n1 <0 || n2<0){
            throw new Exception("n or p should not be negative");
        } else {
            return (long) Math.pow(n1, n2);
        }
    }

}
